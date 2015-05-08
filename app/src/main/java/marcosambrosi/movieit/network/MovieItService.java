/*
 *
 *
 *  *
 *  *  * Copyright (C)  2015 Marcos Ambrosi marcosambrosi@gmail.com
 *  *  *
 *  *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  *  * you may not use this file except in compliance with the License.
 *  *  * You may obtain a copy of the License at
 *  *  *
 *  *  *      http://www.apache.org/licenses/LICENSE-2.0
 *  *  *
 *  *  * Unless required by applicable law or agreed to in writing, software
 *  *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *  * See the License for the specific language governing permissions and
 *  *  * limitations under the License.
 *  *
 *
 */

package marcosambrosi.movieit.network;

import marcosambrosi.movieit.model.MovieResponse;
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by marcosambrosi on 5/6/15.
 */
public interface MovieItService {

    @GET("/discover/movie")
    void discoverMovie(@Path("page") int page, Callback<MovieResponse> callback);
}
