package com.ysyeob.myutils.domain.service;


import com.ysyeob.myutils.domain.entity.UserEntity;
import com.ysyeob.myutils.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Slf4j
@Service
@RequiredArgsConstructor
public class DemoService {
    private final UserRepository userRepository;

    public void getUserInfo(long userId) {
        UserEntity user = userRepository.findById(userId).orElseThrow(RuntimeException::new);
        log.info(user.getUsrNm());
    }
}
