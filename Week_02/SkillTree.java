public class SkillTree {
    public int solution(String skill, String[] skill_trees){
        int answer = 0;
        
        for(int i = 0; i < skill_trees.length; i++){
            
        }

        
        return answer;
    }

    public static void main(String[] args){
        SkillTree st = new SkillTree();
        
        String skill1 = "CBD";
        String[] skill_trees1 = {"BACDE", "CBADF", "AECB", "BDA"};

        String skill2 = "CBDK";
        String[] skill_trees2 = {"CB", "CXYB", "BD", "AECD", "ABC", "AEX", "CDB", "CBKD", "IJCB", "LMDK"};

        System.out.println(st.solution(skill1, skill_trees1));
        System.out.println(st.solution(skill2, skill_trees2));

    }
}
