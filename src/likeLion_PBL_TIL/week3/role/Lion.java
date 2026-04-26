package likeLion_PBL_TIL.week3.role;

import likeLion_PBL_TIL.week3.policy.LionSubmitPolicy;
import likeLion_PBL_TIL.week3.policy.SubmitPolicy;

public class Lion extends Person {
    private String studentId;

    public Lion(String name, String major, int generation, String part, String studentId) {
        super(name, major, generation, part);
        this.studentId = studentId;
    }

    @Override
    protected SubmitPolicy getPolicy() {
        return new LionSubmitPolicy();
    }

    @Override
    public String getInfo() {
        return "======== 📝 결과 출력 ========\n" + "\n" +
                "🎭 역할: 아기사자\n" +
                "👤 이름: " + getName() + " | 🎓 전공: " + getMajor() +
                " | 📌 기수: " + getGeneration() +
                " | 💻 파트 (벡엔드/프론트엔드/기획/디자인): " + getPart() + "\n" +
                "🆔 학번: " + studentId;
    }
}
