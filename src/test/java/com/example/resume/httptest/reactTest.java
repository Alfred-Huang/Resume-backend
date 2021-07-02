package com.example.resume.httptest;

import com.example.resume.DemoApplication;
import com.example.resume.pojo.*;
import com.example.resume.service.impl.ModuleServiceImpl;
import com.example.resume.service.impl.ResumeInfoImpl;
import com.example.resume.service.impl.SectionServiceImpl;
import com.sun.glass.ui.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class reactTest {

    @Autowired
    ResumeInfoImpl resumeInfo;

    @Autowired
    ModuleServiceImpl moduleService;

    @Autowired
    SectionServiceImpl sectionService;

//    @Test
//    public void s(){
//        Module a = new Module("11111", "a", 1);
//        Module b = new Module("33333", "a", 3);
//        Module c = new Module("22222", "a", 2);
//        Module d = new Module("55555", "a", 5);
//        Module e = new Module("44444", "a", 4);
//        List<Module> list = new ArrayList<>();
//        list.add(a);
//        list.add(b);
//        list.add(c);
//        list.add(d);
//        list.add(e);
//        for(Module n : list){
//            System.out.println(n.getId());
//        }
//        System.out.println("-------------");
//        list.sort(Comparator.comparing(Module::getSortId));
//        for(Module n : list){
//            System.out.println(n.getId());
//        }
//    }

    @Test
    public void testMapper(){
//        String sectionId = UUID.randomUUID().toString();
//        String sectionId2 = UUID.randomUUID().toString();
//        String infoId = UUID.randomUUID().toString();
//        String infoId2 = UUID.randomUUID().toString();
//
//        Sections sections = new Sections(sectionId, new ArrayList<>(Collections.singletonList(infoId)));
//        Sections sections2 = new Sections(sectionId2, new ArrayList<>(Collections.singletonList(infoId2)));
//        System.out.println(sections);
//        List<Sections> sectionsList = new ArrayList<>(Arrays.asList(sections, sections2));
//        sectionService.addSectionList(sectionsList);
//        ResumeInfo resumeInfoObj =  resumeInfo.getResumeInfo("1");
//        System.out.println(resumeInfoObj);
//        Map<String, Map<String, Object>> r = new HashMap<>();
//        List<Experience> experiencesList = resumeInfoObj.getExperienceList();
//        List<Sections> sectionsList = resumeInfoObj.getSections();
//        List<Information> informationList = resumeInfoObj.getInformationList();
//        Map<String, Object> exp = new HashMap<>();
//        Map<String, Object> sec = new HashMap<>();
//        Map<String, Object> info = new HashMap<>();
//        for(Experience e : experiencesList){
//            exp.put(e.getModuleId(),e);
//        }
//        for(Sections s : sectionsList){
//            sec.put(s.getSectionId(), s);
//        }
//        for(Information i : informationList){
//            info.put(i.getInfoId(), i);
//        }
//
//        r.put("experience", exp);
//        r.put("sections", sec);
//        r.put("information", info);
//        System.out.println(r.get("experience"));
//        System.out.println(r.get("sections"));
//        System.out.println(r.get("information"));
//        for(ResumeInfo n : moduleList){
//            System.out.println(n);
//        }
    }

//    @Test
//    public void a (){
//       Module module = new Module("123", "a", 1);
//       Module module1 = new Module("124", "b", 2);
//       List<Module> moduleList = new ArrayList<>(Arrays.asList(module, module1));
//       int i = 1;
//       for(Module m : moduleList){
//           m.setSortId(null);
//       }
//        System.out.println(module);
//        System.out.println(module1);
//
//    }
//    int minimumStep = Integer.MAX_VALUE;
//    @Test
//    public void a(){
//        int[] a = {5,6,4,4,6,9,4,4,7,4,4,8,2,6,8,1,5,9,6,5,2,7,9,7,9,6,9,4,1,6,8,8,4,4,2,0,3,8,5};
//        jump(a);
//        System.out.println(minimumStep);
//
//    }
//
//    public int jump(int[] nums) {
//        dfs(nums, 0, 0);
//        return minimumStep;
//    }
//
//
//    public void dfs(int[] nums, int index, int curStep){
//        if(index >= nums.length - 1){
//            minimumStep = Math.min(curStep, minimumStep);
//            return;
//        }
//        int curJumpStep = nums[index];
//        for(int i = 1; i <= curJumpStep; i++){
//            curStep++;
//            dfs(nums, i + index, curStep);
//            curStep--;
//        }
//    }
    @Test
    public void a(){
        System.out.println(strWithout3a3b(5,5));
    }



    public String strWithout3a3b(int a, int b) {
        int aNum = 0;
        StringBuilder sb = new StringBuilder();
        while(a != 0){
            if(aNum == 2 && b != 0){
                sb.append('b');
                b--;
                aNum = 0;
                continue;
            }
            sb.append('a');
            aNum++;
            a--;
        }

        while(b != 0){
            sb.append('b');
            b--;
        }
        return sb.toString();
    }

}
