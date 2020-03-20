package triathlon.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.servlet.support.ServletUriComponentsBuilder
import triathlon.document.Event
import triathlon.repository.SportRepository
import triathlon.document.Sport
import triathlon.repository.EventRepository
import java.net.URI

@RestController
@RequestMapping("events")
class EventController(val eventRepository: EventRepository) {

    @GetMapping
    fun getEvents(): ResponseEntity<MutableList<Event>> {
        return ResponseEntity.ok().body(eventRepository.findAll())
    }

    @PostMapping
    fun create(@RequestBody event: Event): ResponseEntity<Event> {
        eventRepository.save(event)
        val uri: URI = ServletUriComponentsBuilder.fromCurrentRequest().build().toUri()
        return ResponseEntity.created(uri).build<Event>()
    }
}