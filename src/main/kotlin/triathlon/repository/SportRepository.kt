package triathlon.repository

import org.springframework.data.mongodb.repository.MongoRepository
import triathlon.document.Sport

interface SportRepository : MongoRepository<Sport, Long>{}