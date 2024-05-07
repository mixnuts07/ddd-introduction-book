package cli

import applicationService.UserApplicationService
import domainService.UserService
import repository.IUserRepository

class Program(private var serviceProvider: ServiceProvider = ServiceProvider()) {

    fun startup() {
        val serviceCollection = ServiceCollection()
        serviceCollection.addSingleton<IUserRepository, InMemoryUserRepository>()
        serviceCollection.addTransient<UserService>()
        serviceCollection.addTransient<UserApplicationService>()

        this.serviceProvider = serviceCollection.BuildServiceProvider()
    }
}

class ServiceProvider {

}

class InMemoryUserRepository {

}

class ServiceCollection {
    fun <T, U> addSingleton() {
        TODO("Not yet implemented")
    }

    fun <T> addTransient() {
        TODO("Not yet implemented")
    }

    fun BuildServiceProvider(): ServiceProvider {
        TODO("Not yet implemented")
    }

}
