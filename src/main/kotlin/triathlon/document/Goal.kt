package triathlon.document

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document(collection = "goals")
data class Goal (
    @Id val id: String? = null,
    val sport: Sport? = null,
    val event: Event? = null,
    val createDate: LocalDateTime? = null,
    val dayGoal: Double? = null,
    val dayGoalRealized: Double? = null,
    val comments: String? = null
)