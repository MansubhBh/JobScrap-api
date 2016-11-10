/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mansubh.jobscrapapi.entity.dao;

import com.mansubh.jobscrapapi.entity.Job;
import java.util.List;

/**
 *
 * @author mansubh
 */
public interface JobDao {
    List<Job> getAll();
    
    
}
