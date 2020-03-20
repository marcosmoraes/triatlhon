package triathlon.document

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import javax.validation.constraints.NotBlank

@Document(collection = "sports")
data class Sport (
        @Id val id: String? = null,
        @field:NotBlank var name: String? = null
)