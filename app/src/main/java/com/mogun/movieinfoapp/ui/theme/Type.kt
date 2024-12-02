package com.mogun.movieinfoapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.sp
import com.mogun.movieinfoapp.R


private val spoqaBold = FontFamily(
    Font(R.font.spoqa_han_sans_neo_bold, FontWeight.Bold)
)
private val spoqaRegular = FontFamily(
    Font(R.font.spoqa_han_sans_neo_regular, FontWeight.Normal)
)
private val spoqaThin = FontFamily(
    Font(R.font.spoqa_han_sans_neo_thin, FontWeight.Thin)
)

// Set of Material typography styles to start with
val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = spoqaBold,
        fontSize = 60.sp
    ),
    displayMedium = TextStyle(
        fontFamily = spoqaBold,
        fontSize = 32.sp
    ),
    displaySmall = TextStyle(
        fontFamily = spoqaBold,
        fontSize = 24.sp
    ),
    headlineLarge = TextStyle(
        fontFamily = spoqaThin,
        fontSize = 32.sp
    ),
    headlineMedium = TextStyle(
        fontFamily = spoqaBold,
        fontSize = 18.sp
    ),
    headlineSmall = TextStyle(
        fontFamily = spoqaRegular,
        fontSize = 15.sp
    ),
    titleLarge = TextStyle(
        fontFamily = spoqaRegular,
        fontSize = 18.sp
    ),
    titleMedium = TextStyle(
        fontFamily = spoqaRegular,
        fontSize = 14.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = spoqaBold,
        fontSize = 15.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = spoqaRegular,
        fontSize = 15.sp
    ),
    bodySmall = TextStyle(
        fontFamily = spoqaRegular,
        fontSize = 14.sp
    ),
    labelLarge = TextStyle(
        fontFamily = spoqaBold,
        fontSize = 18.sp
    ),
    labelMedium = TextStyle(
        fontFamily = spoqaRegular,
        fontSize = 15.sp
    ),
    labelSmall = TextStyle(
        fontFamily = spoqaRegular,
        fontSize = 14.sp
    )
)

val Typography.h5Title: TextStyle
    @Composable get() = headlineMedium.copy(
        fontSize = 24.sp // headlineMedium을 기반으로 폰트 크기만 조정
    )

val Typography.dialogButton: TextStyle
    @Composable get() = labelLarge.copy(
        fontSize = 18.sp // 버튼 텍스트 스타일 기반으로 크기 조정
    )

val Typography.underlinedDialogButton: TextStyle
    @Composable get() = labelLarge.copy(
        textDecoration = TextDecoration.Underline, // 밑줄 추가
        fontSize = 18.sp // 폰트 크기 조정
    )

val Typography.underlinedButton: TextStyle
    @Composable get() = labelLarge.copy(
        textDecoration = TextDecoration.Underline // 밑줄 추가
    )