package p014OooOo0o;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class OooOOO0 {
    @NonNull
    @DoNotInline
    public static Drawable OooO00o(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        return Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
    }

    @DoNotInline
    public static int OooO0O0(@NonNull TypedArray typedArray) {
        return typedArray.getChangingConfigurations();
    }

    @DoNotInline
    public static void OooO0OO(@NonNull Drawable drawable, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        drawable.inflate(resources, xmlPullParser, attributeSet, theme);
    }
}
