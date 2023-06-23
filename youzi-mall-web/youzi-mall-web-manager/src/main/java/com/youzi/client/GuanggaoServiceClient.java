package com.youzi.client;


import com.youzi.service.AdvertisementService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "advertisements-service")
public interface GuanggaoServiceClient extends AdvertisementService {
}
