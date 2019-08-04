# RuleView

身高体重的自定义尺寸，支持各种精度

## 依赖
 [ ![Download](https://api.bintray.com/packages/st2udio/neo-open/ruler-view/images/download.svg) ](https://bintray.com/st2udio/neo-open/ruler-view/_latestVersion)

`implementation 'com.neobaran.open:ruler-view:0.0.3'`


## 效果图

![png](https://github.com/szpnygo/RulerView/blob/master/images/index.png?raw=true)


## 使用
### XML
```xml
<com.neobaran.open.android.nruler.RulerView
    android:id="@+id/weight_input"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:layout_marginStart="16dp"
    android:layout_marginEnd="16dp"
    android:layout_marginTop="6dp"
    android:layout_marginBottom="4dp"
    app:numDigits="1"
    app:numValue="80"
    app:numMinValue="5"
    app:numMaxValue="300"
    app:numTextColor="@color/secondary_text"
    app:textSize="12sp"
    app:textSpaceHeight="6dp"
    app:centerLineColor="#f24b16"
    app:sideLineColor="#bcbcbc"
    app:centerLineHeight="16dp"
    app:sideLineHeight="8dp"/>
```

### Kotlin
```kotlin
height_input.setUnitStr("cm")
height_number.text = "188.6 cm"
height_input.setValueListener {
    height_number.text = "$it cm"
    val height = height_input.getValue() // get the rule current value
}


//set the number precision, it should be called before setMin / setMax / setValue
//设置精度，如40.5 40.55 必须在设置最大/最小值/当前值 之前调用
weight_input.setDigits(1)
weight_input.setValue(78.8f)           //set the current value
weight_input.setMinValue(10)           //set the min value
weight_input.setMaxValue(220)          //set the max value

weight_number.text = "78.8 kg"
//set listener 设置监听
weight_input.setValueListener {
    weight_number.text = "$it kg"
}
```

### RulerView属性

属性名 | 说明
:------ | :------
centerLineColor | 中间线颜色
centerLineWidth | 中间线宽度
centerLineHeight | 中间线高度
sideLineColor | 两边线颜色
sideLineWidth | 两边线宽度
sideLineHeight | 两边线高度
textSpaceHeight | 数字距离线的间距
numTextColor | 数字颜色
textSize | 字体大小
numDigits | 数字精度
numMaxValue | 数字最大值
numMinValue | 数字最小值
numValue | 数字值
numShow | 页面显示数字数量，
unitStr | 单位


License
---

	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

	   http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.

