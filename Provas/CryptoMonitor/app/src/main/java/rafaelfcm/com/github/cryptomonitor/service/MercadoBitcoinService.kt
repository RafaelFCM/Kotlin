package rafaelfcm.com.github.cryptomonitor.service

import rafaelfcm.com.github.cryptomonitor.model.TickerResponse
import retrofit2.Response
import retrofit2.http.GET
interface MercadoBitcoinService {
    @GET("api/BTC/ticker/")
    suspend fun getTicker(): Response<TickerResponse>
}