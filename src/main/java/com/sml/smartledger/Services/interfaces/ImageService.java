package com.sml.smartledger.Services.interfaces;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface ImageService {

    String uploadImage(MultipartFile contactImage,String fileName) throws IOException;
    String getUrlFromPublicId(String publicId);
}
