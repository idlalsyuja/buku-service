/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.taufiq.buku.service;

import com.taufiq.buku.entity.Buku;
import com.taufiq.buku.repository.BukuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
@Service
public class BukuService {
    @Autowired
    private BukuRepository bukuRepository;
    
    public Buku saveBuku(Buku buku){
        return bukuRepository.save(buku);
    }
    
    public Buku findBukuById(Long bukuId){
        return bukuRepository.findByBukuId(bukuId);
    }



}
