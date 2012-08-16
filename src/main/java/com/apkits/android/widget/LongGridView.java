/**
 * Copyright (C) 2012 ToolkitForAndroid Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
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
package com.apkits.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridView;

/**
 * <ul>
 * <li><b>name : </b>		LongGridView		</li>
 * <li><b>description :</b>	展开其高度的GridView				</li>
 * <li><b>author : </b>		桥下一粒砂			</li>
 * <li><b>e-mail : </b>		chenyoca@gmail.com	</li>
 * <li><b>weibo : </b>		@桥下一粒砂			</li>
 * <li><b>date : </b>		2012-8-16 下午7:55:32		</li>
 * </ul>
 */
public class LongGridView extends GridView {

	public LongGridView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public LongGridView(Context context) {
		super(context);
	}
	
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2,MeasureSpec.AT_MOST);
		super.onMeasure(widthMeasureSpec, expandSpec);
	}

}
