package bjm.ci.cd.project.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "members")
public class MemberEntity {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long memberId;
    @Column(name = "nickname", nullable = false)
    private String nickname;
    @CreatedDate
    private LocalDateTime createdDate;

    @Builder
    public MemberEntity(String nickname){
        this.nickname = nickname;
    }


}
