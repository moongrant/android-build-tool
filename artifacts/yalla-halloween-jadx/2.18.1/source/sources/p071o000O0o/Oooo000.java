package p071o000O0o;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.FontResourcesParserCompat;
import com.yalla.yalla.common.model.ShopVehicleListModel;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(29)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class Oooo000 extends Oooo0 {
    public static int OooO0oo(@NonNull FontStyle fontStyle, @NonNull FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // p071o000O0o.Oooo0
    @Nullable
    public final Typeface OooO00o(Context context, FontResourcesParserCompat.OooO0OO oooO0OO, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (FontResourcesParserCompat.OooO0o oooO0o : oooO0OO.f7822OooO00o) {
                try {
                    Font fontBuild = new Font.Builder(resources, oooO0o.f7827OooO0o).setWeight(oooO0o.f7824OooO0O0).setSlant(oooO0o.f7825OooO0OO ? 1 : 0).setTtcIndex(oooO0o.f7828OooO0o0).setFontVariationSettings(oooO0o.f7826OooO0Oo).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(OooO0oO(fontFamilyBuild, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // p071o000O0o.Oooo0
    @Nullable
    public final Typeface OooO0O0(Context context, @NonNull o000O0.Oooo000[] oooo000Arr, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (o000O0.Oooo000 oooo000 : oooo000Arr) {
                try {
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(oooo000.f28075OooO00o, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor == null) {
                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                        }
                    } else {
                        try {
                            Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(oooo000.f28077OooO0OO).setSlant(oooo000.f28078OooO0Oo ? 1 : 0).setTtcIndex(oooo000.f28076OooO0O0).build();
                            if (builder == null) {
                                builder = new FontFamily.Builder(fontBuild);
                            } else {
                                builder.addFont(fontBuild);
                            }
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(OooO0oO(fontFamilyBuild, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // p071o000O0o.Oooo0
    public final Typeface OooO0OO(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // p071o000O0o.Oooo0
    @Nullable
    public final Typeface OooO0Oo(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font fontBuild = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p071o000O0o.Oooo0
    public final o000O0.Oooo000 OooO0o(o000O0.Oooo000[] oooo000Arr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    public final Font OooO0oO(@NonNull FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : ShopVehicleListModel.VehicleTagType_Vip400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iOooO0oo = OooO0oo(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int iOooO0oo2 = OooO0oo(fontStyle, font2.getStyle());
            if (iOooO0oo2 < iOooO0oo) {
                font = font2;
                iOooO0oo = iOooO0oo2;
            }
        }
        return font;
    }
}
