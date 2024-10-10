package hello.thirdweek.infra.member.jparepository;


import hello.thirdweek.infra.member.entity.MemberInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberInfoJpaRepository extends JpaRepository<MemberInfoEntity, Long> {
}
