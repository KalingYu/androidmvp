/*
 *
 *  * Copyright (C) 2014 Antonio Leiva Gordillo.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *      http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package com.antonioleiva.mvpexample.app.Login;


/**
 * 控制数据从视图层到网络或者本地的流动
 *
 * 1.处理网络层到UI层的数据。将来自 UI 的数据解析成网络框架层所需的格式（通常是 json） ，并调用网络框架层请求服务。
 * 2.处理本地到ui层的数据。用 DAO 存取数据。
 * 3.将网络和本地的数据传给视图层 presenter。
 */
public interface LoginManager {
    public void login(String username, String password, OnLoginFinishedListener listener);
}
