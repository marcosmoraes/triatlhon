package triathlon.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import triathlon.document.Event
import triathlon.document.Goal
import triathlon.document.Sport
import java.time.LocalDateTime

@RestController
@RequestMapping("goals")
class GoalController {

    @GetMapping
    fun getGoals(): ResponseEntity<Goal>{
        val goal: Goal = Goal();
        //goal.comments = "opa"
        return ResponseEntity.ok(goal)
    }
}