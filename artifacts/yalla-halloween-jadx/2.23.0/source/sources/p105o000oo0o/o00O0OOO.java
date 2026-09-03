package p105o000oo0o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.webkit.MimeTypeMap;
import androidx.appcompat.widget.o0000O0O;
import coil.decode.DataSource;
import java.io.File;
import java.io.IOException;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParserException;
import p079o000Oo0o.o000OOo0;
import p079o000Oo0o.o00O000;
import p103o000oo00.o000;
import p103o000oo00.o000O000;
import p109o000ooo.o0Oo0oo;
import p321o0O0ooO.o000O0O0;
import p321o0O0ooO.o000OO00;
import p659o0oooO00.o000O0Oo;
import p659o0oooO00.o00O0000;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0OOO implements o00O0OO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Uri f35795OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o0Oo0oo f35796OooO0O0;

    public static final class OooO00o implements o00O0OO0.OooO00o<Uri> {
        @Override // o000oo0o.o00O0OO0.OooO00o
        public final o00O0OO0 OooO00o(Object obj, o0Oo0oo o0oo0oo2) {
            Uri uri = (Uri) obj;
            if (Intrinsics.areEqual(uri.getScheme(), "android.resource")) {
                return new o00O0OOO(uri, o0oo0oo2);
            }
            return null;
        }
    }

    public o00O0OOO(@NotNull Uri uri, @NotNull o0Oo0oo o0oo0oo2) {
        this.f35795OooO00o = uri;
        this.f35796OooO0O0 = o0oo0oo2;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:50:0x010d  */
    @Override // p105o000oo0o.o00O0OO0
    @Nullable
    public final Object OooO00o(@NotNull Continuation<? super o00O0O0O> continuation) throws XmlPullParserException, IOException {
        Integer intOrNull;
        Drawable drawableOooO00o;
        Drawable bitmapDrawable;
        Drawable o000ooo1;
        Uri uri = this.f35795OooO00o;
        String authority = uri.getAuthority();
        if (authority != null) {
            boolean z = true;
            if (!(!StringsKt.isBlank(authority))) {
                authority = null;
            }
            if (authority != null) {
                String str = (String) CollectionsKt.lastOrNull((List) uri.getPathSegments());
                if (str == null || (intOrNull = StringsKt.toIntOrNull(str)) == null) {
                    throw new IllegalStateException(o0000O0O.OooO00o("Invalid android.resource URI: ", uri));
                }
                int iIntValue = intOrNull.intValue();
                o0Oo0oo o0oo0oo2 = this.f35796OooO0O0;
                Context context = o0oo0oo2.f35863OooO00o;
                Resources resources = Intrinsics.areEqual(authority, context.getPackageName()) ? context.getResources() : context.getPackageManager().getResourcesForApplication(authority);
                TypedValue typedValue = new TypedValue();
                resources.getValue(iIntValue, typedValue, true);
                CharSequence charSequence = typedValue.string;
                String strOooO0O0 = o000O0O0.OooO0O0(MimeTypeMap.getSingleton(), charSequence.subSequence(StringsKt__StringsKt.lastIndexOf$default(charSequence, '/', 0, false, 6, (Object) null), charSequence.length()).toString());
                if (!Intrinsics.areEqual(strOooO0O0, "text/xml")) {
                    TypedValue typedValue2 = new TypedValue();
                    o00O0000 o00o0000OooO0O0 = o000O0Oo.OooO0O0(o000O0Oo.OooO0oo(resources.openRawResource(iIntValue, typedValue2)));
                    o000 o000Var = new o000(authority, iIntValue, typedValue2.density);
                    File cacheDir = context.getCacheDir();
                    cacheDir.mkdirs();
                    return new oo0oOO0(new o000O000(o00o0000OooO0O0, cacheDir, o000Var), strOooO0O0, DataSource.DISK);
                }
                if (Intrinsics.areEqual(authority, context.getPackageName())) {
                    bitmapDrawable = p321o0O0ooO.o000O000.OooO00o(iIntValue, context);
                } else {
                    XmlResourceParser xml = resources.getXml(iIntValue);
                    int next = xml.next();
                    while (next != 2 && next != 1) {
                        next = xml.next();
                    }
                    if (next != 2) {
                        throw new XmlPullParserException("No start tag found.");
                    }
                    if (Build.VERSION.SDK_INT < 24) {
                        String name = xml.getName();
                        if (Intrinsics.areEqual(name, "vector")) {
                            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                            Resources.Theme theme = context.getTheme();
                            o000ooo1 = new o00O000();
                            o000ooo1.inflate(resources, xml, attributeSetAsAttributeSet, theme);
                        } else if (Intrinsics.areEqual(name, "animated-vector")) {
                            AttributeSet attributeSetAsAttributeSet2 = Xml.asAttributeSet(xml);
                            Resources.Theme theme2 = context.getTheme();
                            o000ooo1 = new o000OOo0(context);
                            o000ooo1.inflate(resources, xml, attributeSetAsAttributeSet2, theme2);
                        } else {
                            Resources.Theme theme3 = context.getTheme();
                            ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.OooO00o.f5288OooO00o;
                            drawableOooO00o = androidx.core.content.res.OooO00o.C0119OooO00o.OooO00o(resources, iIntValue, theme3);
                            if (drawableOooO00o != null) {
                                throw new IllegalStateException(android.support.v4.media.OooO00o.OooO00o("Invalid resource ID: ", iIntValue).toString());
                            }
                            bitmapDrawable = drawableOooO00o;
                        }
                        bitmapDrawable = o000ooo1;
                    } else {
                        Resources.Theme theme4 = context.getTheme();
                        ThreadLocal<TypedValue> threadLocal2 = androidx.core.content.res.OooO00o.f5288OooO00o;
                        drawableOooO00o = androidx.core.content.res.OooO00o.C0119OooO00o.OooO00o(resources, iIntValue, theme4);
                        if (drawableOooO00o != null) {
                            throw new IllegalStateException(android.support.v4.media.OooO00o.OooO00o("Invalid resource ID: ", iIntValue).toString());
                        }
                        bitmapDrawable = drawableOooO00o;
                    }
                }
                if (!(bitmapDrawable instanceof VectorDrawable) && !(bitmapDrawable instanceof o00O000)) {
                    z = false;
                }
                if (z) {
                    bitmapDrawable = new BitmapDrawable(context.getResources(), o000OO00.OooO00o(bitmapDrawable, o0oo0oo2.f35864OooO0O0, o0oo0oo2.f35866OooO0Oo, o0oo0oo2.f35868OooO0o0, o0oo0oo2.f35867OooO0o));
                }
                return new o00O0O0(bitmapDrawable, z, DataSource.DISK);
            }
        }
        throw new IllegalStateException(o0000O0O.OooO00o("Invalid android.resource URI: ", uri));
    }
}
