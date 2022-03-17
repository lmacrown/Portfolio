package com.test.service.banner;

import com.test.dao.BannerDao;
import com.test.dto.BannerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BannerServiceImp implements BannerService {
    @Autowired
    BannerDao bannerDao;

//    @Override
//    public void insertBanner(String img,    String count, String getDate,
//                             String title, String content) {
//        System.out.println("banner " +  img + "," + count + "," +
//                                        getDate + "," + title + "," + content);
//        bannerDao.insertBanner(img,count,getDate,title,content);
//    }

    @Override
    public void insertBanner(BannerDto bannerDto){
        System.out.println("Start insert banner service");
        bannerDao.insertBanner(bannerDto);
        System.out.println("End insert banner service");
    }

    @Override
    public void deleteBanner(String banNo) {
        bannerDao.deleteBanner(banNo);
    }

    @Override
    public ArrayList<BannerDto> readBasicDataList() {
        return bannerDao.readBasicDataList();
    }

    @Override
    public BannerDto readBasicDataByBanNo(String banNo) {
        return bannerDao.readBasicDataByBanNo(banNo);
    }

    @Override
    public void updateBanner(String banNo, BannerDto bannerDto){
        bannerDao.updateBanner(banNo, bannerDto);
    }
}