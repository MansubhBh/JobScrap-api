/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mansubh.jobscrapapi.operations;

import com.mansubh.jobscrapapi.entity.Job;
import java.util.ArrayList;
import java.util.List;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author mansubh
 */
public class JobScrapWork {
   private static final String mainurl = "http://www.jobsnepal.com";
    
    public static List<Job> getHotJobs(){
      
        List<Job> hotjoblist = new ArrayList<>();
        try{
        Document docs = Jsoup.connect(mainurl).get();
        Elements allElements = docs.select("td.pl-15 a.job-item");
        for(Element e : allElements ){
             
            String jobtitle = e.text();
               Job job = new Job();
             job.setTitle(jobtitle);

            String joburl = e.attr("href");
            
            Document eachDocument = Jsoup.connect(joburl).get();
            StringBuilder builder = new StringBuilder();
            Elements eachElements = eachDocument.select("div#job-overview ul li span");
            for(Element el : eachElements){
                
                builder.append(el.text()+ ",");
            }
            String jobSpecs = builder.toString();
            String[] tokens = jobSpecs.split(",");
            job.setCategory(tokens[0]);
            job.setPosType(tokens[1]);
            job.setExpr(tokens[2]);
            job.setOpenings(tokens[3]);
            job.setEducation(tokens[4]);
            job.setCity(tokens[5]);
            hotjoblist.add(job);
            
        }
        
        
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return hotjoblist;
        
    }
}
