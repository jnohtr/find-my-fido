package com.example.demo;

//public class DataLoader {
//}


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataLoader implements CommandLineRunner{

    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    ////
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void run(String... strings) throws Exception {

        System.out.println("Loading data . . .");

        roleRepository.save(new Role("USER"));
        roleRepository.save(new Role("ADMIN"));

        Role adminRole = roleRepository.findByRole("ADMIN");
        Role userRole = roleRepository.findByRole("USER");

//        User user = new User("bob@bob.com","bob","Bob","Bobberson", true, "bob");
//        user.setRoles(Arrays.asList(userRole));
        //!
//        user.setPassword(passwordEncoder.encode(user.getPassword()));
//        userRepository.save(user);

//        user = new User("dam@sam.com","jim","Jim","Jimmerson", true, "jim");
//        user.setRoles(Arrays.asList(userRole));
//        //uu
//        user.setPassword(passwordEncoder.encode(user.getPassword()));
//        userRepository.save(user);
//
//        user = new User("admin@adm.com","pass","Admin","User", true, "admin");
//        user.setRoles(Arrays.asList(adminRole));
//        //
//        user.setPassword(passwordEncoder.encode(user.getPassword()));
//        userRepository.save(user);
//
//        user = new User("sam@ev.com","pass","Sam","everyman", true, "sam");
//        user.setRoles(Arrays.asList(userRole, adminRole));
//        //A
//        user.setPassword(passwordEncoder.encode(user.getPassword()));
//        userRepository.save(user);

        //
        User user = new User("bob@bob.com","bob","Bob","pet", "picture", true, "bob");
        user.setRoles(Arrays.asList(userRole));
        //!
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);

        user = new User("dam@sam.com","jim","Jim","Jimmerson","picture",  true, "jim");
        user.setRoles(Arrays.asList(userRole));
        //uu
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);

        user = new User("admin@adm.com","pass","Admin","pet", "picture", true, "admin");
        user.setRoles(Arrays.asList(adminRole));
        //
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);

        user = new User("sam@ev.com","pass","Sam","everyman", "picture", true, "bo");
        user.setRoles(Arrays.asList(userRole, adminRole));
        //A
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);


        user = new User("ju@ju.com","pass","Juyeon","Nury pumpkin", "Nuryspicture", true, "lisa");
        user.setRoles(Arrays.asList(userRole, adminRole));
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);

    }
}
