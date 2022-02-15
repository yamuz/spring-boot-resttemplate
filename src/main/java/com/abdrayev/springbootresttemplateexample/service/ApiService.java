package com.abdrayev.springbootresttemplateexample.service;

import com.abdrayev.springbootresttemplateexample.pojo.Character;
import org.springframework.http.ResponseEntity;

public interface ApiService {
    Character getAllCharacter();
    ResponseEntity<Character> getEntity();
}
