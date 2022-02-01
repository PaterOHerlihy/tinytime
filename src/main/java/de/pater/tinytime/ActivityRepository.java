package de.pater.tinytime;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

interface ActivityRepository extends JpaRepository<Activity, Long> {
	
	
}
