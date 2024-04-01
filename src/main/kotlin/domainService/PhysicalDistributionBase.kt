package domainService

class PhysicalDistributionBase {
    fun ship(baggage: Baggage): Baggage {
        return baggage
    }
    fun receive(baggage: Baggage): Baggage {
        return baggage
    }
    fun transport(to: PhysicalDistributionBase, baggage: Baggage) {
        val shippedBaggage = ship(baggage)
        to.receive(shippedBaggage)
    }
}

class TransportService {
    fun transport(from: PhysicalDistributionBase, to: PhysicalDistributionBase, baggage: Baggage) {
        val shippedBaggage = from.ship(baggage)
        to.receive(shippedBaggage)
    }
}

class Baggage {

}
