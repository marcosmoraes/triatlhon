package triathlon.metric

import io.prometheus.client.Counter

internal class CounterMetric {
    private val requests = Counter.build()
            .name("requests_total").help("Total requests.").register()

    fun processRequest() {
        requests.inc()
        // Your code here.
    }
}