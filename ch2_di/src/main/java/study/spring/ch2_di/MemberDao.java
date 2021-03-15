package study.spring.ch2_di;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.stereotype.Component;
import study.spring.ch2_di.mapper.MemberRowMapper;

import javax.sql.DataSource;
import java.sql.*;
import java.util.Collection;
import java.util.List;

@Component
public class MemberDao {

    private JdbcTemplate jdbcTemplate;

    public MemberDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public Member selectByEmail(String email) {
        List<Member> results = jdbcTemplate.query(
                "select * from MEMBER where EMAIL = ?",
                new MemberRowMapper(),
                email);

        return results.isEmpty() ? null : results.get(0);
    }

    public void insert(Member member) {
        jdbcTemplate.update(con -> {
            PreparedStatement preparedStatement = con.prepareStatement(
                    "insert into MEMBER(EMAIL. PASSWORD, NAME, REGDATE) values (?,?,?,?)");
            preparedStatement.setString(1, member.getEmail());
            preparedStatement.setString(2, member.getPassword());
            preparedStatement.setString(3, member.getName());
            preparedStatement.setTimestamp(4, Timestamp.valueOf(member.getRegisterDateTime()));

            return preparedStatement;
        });
    }

    public void update(Member member) {
        jdbcTemplate.update(
                "update MEMBER set NAME = ?, PASSWORD = ? where EMAIL = ?",
                member.getName(), member.getPassword(), member.getEmail());
    }

    public Collection<Member> selectAll() {
        List<Member> results = jdbcTemplate.query(
                "select * from MEMBER",
                new MemberRowMapper());

        return results;
    }

    public int count() {
        return jdbcTemplate.queryForObject(
                "select count(*) from MEMBER", Integer.class);
    }
}
