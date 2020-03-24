package ninja.saad.palaocorona.data.liveupdates

import io.reactivex.Single
import ninja.saad.palaocorona.base.data.network.onResponse
import ninja.saad.palaocorona.data.liveupdates.model.LiveUpdateResponse
import javax.inject.Inject

class LiveUpdateDataSource @Inject constructor(private val liveUpdateNetworkService: LiveUpdateRestService) {
    
    fun getLiveUpdate(): Single<LiveUpdateResponse> {
        return liveUpdateNetworkService.getLiveUpdate()
            .onResponse()
    }
}