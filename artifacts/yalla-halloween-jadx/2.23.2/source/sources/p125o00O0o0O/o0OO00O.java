package p125o00O0o0O;

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
import o00O00OO.OooO0o;
import o00O00OO.OooOOO;
import o00OO00O.OooO0OO;
import o00OO00O.OooOo00;
import o00OO00O.Oooo000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParserException;
import p124o00O0o00.o0000O;
import p124o00O0o00.o0000OO0;
import p131o00O0oo0.o0O0O00;
import p662o0oooO0O.o0OO;
import p662o0oooO0O.o0o0000;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO00O implements o0ooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Uri f36605OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o0O0O00 f36606OooO0O0;

    public static final class OooO00o implements o0ooOOo.OooO00o<Uri> {
        @Override // o00O0o0O.o0ooOOo.OooO00o
        public final o0ooOOo OooO00o(Object obj, o0O0O00 o0o0o00) {
            Uri uri = (Uri) obj;
            if (Intrinsics.areEqual(uri.getScheme(), "android.resource")) {
                return new o0OO00O(uri, o0o0o00);
            }
            return null;
        }
    }

    public o0OO00O(@NotNull Uri uri, @NotNull o0O0O00 o0o0o00) {
        this.f36605OooO00o = uri;
        this.f36606OooO0O0 = o0o0o00;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:50:0x010d  */
    @Override // p125o00O0o0O.o0ooOOo
    @Nullable
    public final Object OooO00o(@NotNull Continuation<? super o00oO0o> continuation) throws XmlPullParserException, IOException {
        Integer intOrNull;
        Drawable drawableOooO00o;
        Drawable bitmapDrawable;
        Drawable oooO0o;
        Uri uri = this.f36605OooO00o;
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
                o0O0O00 o0o0o00 = this.f36606OooO0O0;
                Context context = o0o0o00.f36838OooO00o;
                Resources resources = Intrinsics.areEqual(authority, context.getPackageName()) ? context.getResources() : context.getPackageManager().getResourcesForApplication(authority);
                TypedValue typedValue = new TypedValue();
                resources.getValue(iIntValue, typedValue, true);
                CharSequence charSequence = typedValue.string;
                String strOooO0O0 = OooOo00.OooO0O0(MimeTypeMap.getSingleton(), charSequence.subSequence(StringsKt__StringsKt.lastIndexOf$default(charSequence, '/', 0, false, 6, (Object) null), charSequence.length()).toString());
                if (!Intrinsics.areEqual(strOooO0O0, "text/xml")) {
                    TypedValue typedValue2 = new TypedValue();
                    o0o0000 o0o0000VarOooO0O0 = o0OO.OooO0O0(o0OO.OooO0oo(resources.openRawResource(iIntValue, typedValue2)));
                    o0000O o0000o2 = new o0000O(authority, iIntValue, typedValue2.density);
                    File cacheDir = context.getCacheDir();
                    cacheDir.mkdirs();
                    return new oo0o0Oo(new o0000OO0(o0o0000VarOooO0O0, cacheDir, o0000o2), strOooO0O0, DataSource.DISK);
                }
                if (Intrinsics.areEqual(authority, context.getPackageName())) {
                    bitmapDrawable = OooO0OO.OooO00o(iIntValue, context);
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
                            oooO0o = new OooOOO();
                            oooO0o.inflate(resources, xml, attributeSetAsAttributeSet, theme);
                        } else if (Intrinsics.areEqual(name, "animated-vector")) {
                            AttributeSet attributeSetAsAttributeSet2 = Xml.asAttributeSet(xml);
                            Resources.Theme theme2 = context.getTheme();
                            oooO0o = new OooO0o(context);
                            oooO0o.inflate(resources, xml, attributeSetAsAttributeSet2, theme2);
                        } else {
                            Resources.Theme theme3 = context.getTheme();
                            ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.OooO00o.f5298OooO00o;
                            drawableOooO00o = androidx.core.content.res.OooO00o.C0121OooO00o.OooO00o(resources, iIntValue, theme3);
                            if (drawableOooO00o != null) {
                                throw new IllegalStateException(android.support.v4.media.OooO00o.OooO00o("Invalid resource ID: ", iIntValue).toString());
                            }
                            bitmapDrawable = drawableOooO00o;
                        }
                        bitmapDrawable = oooO0o;
                    } else {
                        Resources.Theme theme4 = context.getTheme();
                        ThreadLocal<TypedValue> threadLocal2 = androidx.core.content.res.OooO00o.f5298OooO00o;
                        drawableOooO00o = androidx.core.content.res.OooO00o.C0121OooO00o.OooO00o(resources, iIntValue, theme4);
                        if (drawableOooO00o != null) {
                            throw new IllegalStateException(android.support.v4.media.OooO00o.OooO00o("Invalid resource ID: ", iIntValue).toString());
                        }
                        bitmapDrawable = drawableOooO00o;
                    }
                }
                if (!(bitmapDrawable instanceof VectorDrawable) && !(bitmapDrawable instanceof OooOOO)) {
                    z = false;
                }
                if (z) {
                    bitmapDrawable = new BitmapDrawable(context.getResources(), Oooo000.OooO00o(bitmapDrawable, o0o0o00.f36839OooO0O0, o0o0o00.f36841OooO0Oo, o0o0o00.f36843OooO0o0, o0o0o00.f36842OooO0o));
                }
                return new oo000o(bitmapDrawable, z, DataSource.DISK);
            }
        }
        throw new IllegalStateException(o0000O0O.OooO00o("Invalid android.resource URI: ", uri));
    }
}
