package likeLion_PBL_TIL.week3.role;

import likeLion_PBL_TIL.week3.policy.StaffSubmitPolicy;
import likeLion_PBL_TIL.week3.policy.SubmitPolicy;

public class Staff extends Person {
    private String position;

    public Staff(String name, String major, int generation, String part, String position) {
        super(name, major, generation, part);
        this.position = position;
    }

    @Override
    protected SubmitPolicy getPolicy() {
        return new StaffSubmitPolicy();
    }

    @Override
    public String getInfo() {
        return "🎭 역할: 운영진\n" +
                "👤 이름: " + getName() + " | 🎓 전공: " + getMajor() +
                " | 📌 기수: " + getGeneration() +
                " | 💻 파트 (벡엔드/프론트엔드/기획/디자인): " + getPart() + "\n" +
                "⭐ 직책 (대표/부대표/파트장/멘토): " + position;
    }
}
