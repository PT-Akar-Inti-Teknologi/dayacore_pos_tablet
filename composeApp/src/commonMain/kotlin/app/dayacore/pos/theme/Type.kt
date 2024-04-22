package app.dayacore.pos.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.Font
import pos_dayacore.composeapp.generated.resources.Poppins_Black
import pos_dayacore.composeapp.generated.resources.Poppins_BlackItalic
import pos_dayacore.composeapp.generated.resources.Poppins_Bold
import pos_dayacore.composeapp.generated.resources.Poppins_BoldItalic
import pos_dayacore.composeapp.generated.resources.Poppins_ExtraBold
import pos_dayacore.composeapp.generated.resources.Poppins_ExtraBoldItalic
import pos_dayacore.composeapp.generated.resources.Poppins_ExtraLight
import pos_dayacore.composeapp.generated.resources.Poppins_ExtraLightItalic
import pos_dayacore.composeapp.generated.resources.Poppins_Italic
import pos_dayacore.composeapp.generated.resources.Poppins_Light
import pos_dayacore.composeapp.generated.resources.Poppins_LightItalic
import pos_dayacore.composeapp.generated.resources.Poppins_Medium
import pos_dayacore.composeapp.generated.resources.Poppins_MediumItalic
import pos_dayacore.composeapp.generated.resources.Poppins_Regular
import pos_dayacore.composeapp.generated.resources.Poppins_SemiBold
import pos_dayacore.composeapp.generated.resources.Poppins_SemiBoldItalic
import pos_dayacore.composeapp.generated.resources.Poppins_Thin
import pos_dayacore.composeapp.generated.resources.Poppins_ThinItalic
import pos_dayacore.composeapp.generated.resources.Res

// Set of Material typography styles to start with
@Composable
fun getTypography(): Typography {
    return Typography(
        bodyLarge = TextStyle(
            fontFamily = AppFont,
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp,
            lineHeight = 24.sp,
            letterSpacing = 0.5.sp
        ),
        bodyMedium = TextStyle(
            fontFamily = AppFont,
            fontWeight = FontWeight.Normal,
            fontSize = 14.sp,
            lineHeight = 20.0.sp,
            letterSpacing = 0.2.sp,
        ),
        bodySmall = TextStyle(
            fontFamily = AppFont,
            fontWeight = FontWeight.Thin,
            fontSize = 12.sp,
            lineHeight = 16.0.sp,
            letterSpacing = 0.4.sp
        ),
        titleLarge = TextStyle(
            fontFamily = AppFont,
            fontWeight = FontWeight.Normal,
            fontSize = 22.sp,
            lineHeight = 28.sp,
            letterSpacing = 0.sp
        ),
        labelSmall = TextStyle(
            fontFamily = AppFont,
            fontWeight = FontWeight.Medium,
            fontSize = 11.sp,
            lineHeight = 16.sp,
            letterSpacing = 0.5.sp
        ),
    )
}

val AppFont: FontFamily
    @Composable get() = FontFamily(
        Font(
            Res.font.Poppins_Black,
            FontWeight.Black,
            FontStyle.Normal
        ),
        Font(
            Res.font.Poppins_BlackItalic,
            FontWeight.Black,
            FontStyle.Italic
        ),
        Font(
            Res.font.Poppins_Bold,
            FontWeight.Bold,
            FontStyle.Normal
        ),
        Font(
            Res.font.Poppins_BoldItalic,
            FontWeight.ExtraBold,
            FontStyle.Italic
        ),
        Font(
            Res.font.Poppins_ExtraBold,
            FontWeight.ExtraBold,
            FontStyle.Normal
        ),
        Font(
            Res.font.Poppins_ExtraBoldItalic,
            FontWeight.ExtraBold,
            FontStyle.Italic
        ),
        Font(
            Res.font.Poppins_ExtraLight,
            FontWeight.ExtraLight,
            FontStyle.Normal
        ),
        Font(
            Res.font.Poppins_ExtraLightItalic,
            FontWeight.ExtraLight,
            FontStyle.Italic
        ),
        Font(
            Res.font.Poppins_Italic,
            FontWeight.Normal,
            FontStyle.Italic
        ),
        Font(
            Res.font.Poppins_Light,
            FontWeight.Light,
            FontStyle.Normal
        ),
        Font(
            Res.font.Poppins_LightItalic,
            FontWeight.Light,
            FontStyle.Italic
        ),
        Font(
            Res.font.Poppins_Medium,
            FontWeight.Medium,
            FontStyle.Normal
        ),
        Font(
            Res.font.Poppins_MediumItalic,
            FontWeight.Medium,
            FontStyle.Italic
        ),
        Font(
            Res.font.Poppins_Regular,
            FontWeight.Normal,
            FontStyle.Normal
        ),
        Font(
            Res.font.Poppins_SemiBold,
            FontWeight.SemiBold,
            FontStyle.Normal
        ),
        Font(
            Res.font.Poppins_SemiBoldItalic,
            FontWeight.SemiBold,
            FontStyle.Italic
        ),
        Font(
            Res.font.Poppins_Thin,
            FontWeight.Thin,
            FontStyle.Normal
        ),
        Font(
            Res.font.Poppins_ThinItalic,
            FontWeight.Thin,
            FontStyle.Italic
        )
    )