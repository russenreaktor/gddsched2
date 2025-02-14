/*
 * Copyright 2011 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package gdd11.app.ui;

import com.google.android.apps.iosched2.util.NotifyingAsyncQueryHandler;

import android.widget.CompoundButton;

/**
 * A fragment that shows detail information for a session, including session
 * title, abstract, time information, speaker photos and bios, etc.
 */
public class SessionDetailFragment extends
		com.google.android.apps.iosched2.ui.SessionDetailFragment implements
		NotifyingAsyncQueryHandler.AsyncQueryListener,
		CompoundButton.OnCheckedChangeListener {

}
