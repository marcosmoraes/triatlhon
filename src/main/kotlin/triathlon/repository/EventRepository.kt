package triathlon.repository

import org.springframework.data.mongodb.repository.MongoRepository
import triathlon.document.Event

interface EventRepository: MongoRepository<Event, String> {
}