package p052o00000oO;

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
import com.google.logging.type.LogSeverity;
import java.io.IOException;
import java.io.InputStream;
import o0000O0.Oooo000;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(29)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o000oOoO extends o00O0O {
    public static Font OooO0oO(@NonNull FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? LogSeverity.ALERT_VALUE : 400, (i & 2) != 0 ? 1 : 0);
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

    public static int OooO0oo(@NonNull FontStyle fontStyle, @NonNull FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // p052o00000oO.o00O0O
    @Nullable
    public final Typeface OooO00o(Context context, FontResourcesParserCompat.OooO0OO oooO0OO, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (FontResourcesParserCompat.OooO0o oooO0o : oooO0OO.f5281OooO00o) {
                try {
                    Font fontBuild = new Font.Builder(resources, oooO0o.f5286OooO0o).setWeight(oooO0o.f5283OooO0O0).setSlant(oooO0o.f5284OooO0OO ? 1 : 0).setTtcIndex(oooO0o.f5287OooO0o0).setFontVariationSettings(oooO0o.f5285OooO0Oo).build();
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

    @Override // p052o00000oO.o00O0O
    @Nullable
    public final Typeface OooO0O0(Context context, @NonNull Oooo000[] oooo000Arr, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (Oooo000 oooo000 : oooo000Arr) {
                try {
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(oooo000.f34080OooO00o, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor == null) {
                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                        }
                    } else {
                        try {
                            Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(oooo000.f34082OooO0OO).setSlant(oooo000.f34083OooO0Oo ? 1 : 0).setTtcIndex(oooo000.f34081OooO0O0).build();
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

    @Override // p052o00000oO.o00O0O
    public final Typeface OooO0OO(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // p052o00000oO.o00O0O
    @Nullable
    public final Typeface OooO0Oo(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font fontBuild = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p052o00000oO.o00O0O
    public final Oooo000 OooO0o(int i, Oooo000[] oooo000Arr) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
