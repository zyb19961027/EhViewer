/*
 * Copyright 2017 Hippo Seven
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hippo.ehviewer.scene

import android.os.Bundle
import com.hippo.ehviewer.client.GLUrlBuilder
import com.hippo.ehviewer.client.data.GalleryInfo

/*
 * Created by Hippo on 2017/8/6.
 */

fun galleryList(builder: GLUrlBuilder): GalleryListScene {
  val args = Bundle()
  args.putParcelable(GalleryListScene.KEY_GL_URL_BUILDER, builder)
  val scene = GalleryListScene()
  scene.setArgs(args)
  return scene
}

fun galleryDetail(info: GalleryInfo): GalleryDetailScene {
  val args = Bundle()
  args.putParcelable(GalleryDetailScene.KEY_GALLERY_INFO, info)
  val scene = GalleryDetailScene()
  scene.setArgs(args)
  return scene
}
