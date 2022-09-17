package com.machinestalk.machinest.repositories;

import com.machinestalk.machinest.entities.UserMachinesTalk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <UserMachinesTalk,Long> {
}
