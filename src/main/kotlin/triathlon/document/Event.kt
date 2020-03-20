package triathlon.document

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime
import java.util.*

@Document(collection = "events")
data class Event (
        @Id val id: String? = null,
        val name: String? = null,
        val local: String? = null,
        val registerDate: LocalDateTime? = LocalDateTime.now(),
        val competitionDate: LocalDateTime? = LocalDateTime.of(2020,5,10,9,0,0)
)
