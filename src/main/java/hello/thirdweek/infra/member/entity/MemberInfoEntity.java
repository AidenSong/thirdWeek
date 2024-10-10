package hello.thirdweek.infra.member.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "MEMBER")
public class MemberInfoEntity {

    @Id
    private long memberId;
    private int memberAmount;
}
