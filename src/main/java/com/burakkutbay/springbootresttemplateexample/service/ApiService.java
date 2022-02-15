package com.burakkutbay.springbootresttemplateexample.service;

import com.burakkutbay.springbootresttemplateexample.pojo.Character;
import org.springframework.http.ResponseEntity;

public interface ApiService {
    public Character getAllCharacter();
    public ResponseEntity<Character> getEntity();
}
