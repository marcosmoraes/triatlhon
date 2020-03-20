package triathlon.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.servlet.support.ServletUriComponentsBuilder
import triathlon.metric.CounterMetric
import triathlon.repository.SportRepository
import triathlon.document.Sport
import java.net.URI


@RestController
@RequestMapping("sports")
class SportController(val sportRepository: SportRepository) {

    @GetMapping
    fun getSports(): ResponseEntity<MutableList<Sport>> {
        return ResponseEntity.ok().body(sportRepository.findAll())
    }

    @PostMapping
    fun create(@RequestBody sport: Sport): ResponseEntity<Sport> {
        sportRepository.save(sport)
        val uri: URI = ServletUriComponentsBuilder.fromCurrentRequest().build().toUri()
        return ResponseEntity.created(uri).build<Sport>()
    }

    @GetMapping("metrics")
    fun getCounterMetric():String{
        val metrics = CounterMetric()
        return metrics.processRequest().toString()
    }


}