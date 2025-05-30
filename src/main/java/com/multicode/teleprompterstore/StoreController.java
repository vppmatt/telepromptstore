package com.multicode.teleprompterstore;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin
public class StoreController {

    private String storedData;

    @GetMapping("/store")
    public Map<String,String> getStoredData() {
        return Map.of("data",storedData);
    }

    @PostMapping("/store")
    public void setStoredData(@RequestBody Map<String,String> incomingData) {
        this.storedData = incomingData.get("data");
    }

}
