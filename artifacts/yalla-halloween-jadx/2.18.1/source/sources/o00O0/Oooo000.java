package o00O0;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.os.Build;
import android.util.TypedValue;
import android.util.Xml;
import android.webkit.MimeTypeMap;
import coil.decode.DataSource;
import coil.size.Size;
import java.io.InputStream;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.xmlpull.v1.XmlPullParserException;
import p115o00O00oO.o000oOoO;
import p115o00O00oO.o00oO0o;
import p119o00O0Oo0.o00O0O;
import p660o0ooo0o0.o00O;
import p674o0oooo0.o0O000Oo;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo000 implements OooOO0O<Uri> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Context f30086OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o000oOoO f30087OooO0O0;

    public Oooo000(@NotNull Context context, @NotNull o000oOoO drawableDecoder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(drawableDecoder, "drawableDecoder");
        this.f30086OooO00o = context;
        this.f30087OooO0O0 = drawableDecoder;
    }

    @Override // o00O0.OooOO0O
    public final boolean OooO00o(Uri uri) {
        Uri data = uri;
        Intrinsics.checkNotNullParameter(data, "data");
        return Intrinsics.areEqual(data.getScheme(), "android.resource");
    }

    @Override // o00O0.OooOO0O
    public final String OooO0O0(Uri uri) {
        Uri data = uri;
        Intrinsics.checkNotNullParameter(data, "data");
        StringBuilder sb = new StringBuilder();
        sb.append(data);
        sb.append('-');
        Configuration configuration = this.f30086OooO00o.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "context.resources.configuration");
        o00O o00o2 = o00O0O.f30749OooO00o;
        Intrinsics.checkNotNullParameter(configuration, "<this>");
        sb.append(configuration.uiMode & 48);
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0108  */
    /* JADX WARN: Code duplicated, block: B:47:0x0114  */
    @Override // o00O0.OooOO0O
    public final Object OooO0OO(p113o00O00Oo.OooO0O0 oooO0O0, Uri uri, Size size, o00oO0o o00oo0o2, Continuation continuation) throws Throwable {
        Drawable bitmapDrawable;
        Drawable drawableOooO00o;
        Uri uri2 = uri;
        String authority = uri2.getAuthority();
        boolean z = true;
        if (authority == null || !(!StringsKt.isBlank(authority))) {
            authority = null;
        }
        if (authority == null) {
            throw new IllegalStateException(Intrinsics.stringPlus("Invalid android.resource URI: ", uri2));
        }
        List<String> pathSegments = uri2.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "data.pathSegments");
        String str = (String) CollectionsKt.lastOrNull((List) pathSegments);
        Integer intOrNull = str != null ? StringsKt.toIntOrNull(str) : null;
        if (intOrNull == null) {
            throw new IllegalStateException(Intrinsics.stringPlus("Invalid android.resource URI: ", uri2));
        }
        int iIntValue = intOrNull.intValue();
        Context context = o00oo0o2.f30375OooO00o;
        Resources resources = context.getPackageManager().getResourcesForApplication(authority);
        Intrinsics.checkNotNullExpressionValue(resources, "context.packageManager.g…rApplication(packageName)");
        TypedValue typedValue = new TypedValue();
        resources.getValue(iIntValue, typedValue, true);
        CharSequence path = typedValue.string;
        Intrinsics.checkNotNullExpressionValue(path, "path");
        String string = path.subSequence(StringsKt__StringsKt.lastIndexOf$default(path, '/', 0, false, 6, (Object) null), path.length()).toString();
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        Intrinsics.checkNotNullExpressionValue(singleton, "getSingleton()");
        String strOooO0O0 = o00O0O.OooO0O0(singleton, string);
        if (!Intrinsics.areEqual(strOooO0O0, "text/xml")) {
            InputStream inputStreamOpenRawResource = resources.openRawResource(iIntValue);
            Intrinsics.checkNotNullExpressionValue(inputStreamOpenRawResource, "resources.openRawResource(resId)");
            return new Oooo0(o0O000Oo.OooO0OO(o0O000Oo.OooO(inputStreamOpenRawResource)), strOooO0O0, DataSource.DISK);
        }
        if (!Intrinsics.areEqual(authority, context.getPackageName())) {
            Intrinsics.checkNotNullParameter(context, "<this>");
            Intrinsics.checkNotNullParameter(resources, "resources");
            XmlResourceParser xml = resources.getXml(iIntValue);
            Intrinsics.checkNotNullExpressionValue(xml, "resources.getXml(resId)");
            int next = xml.next();
            while (next != 2 && next != 1) {
                next = xml.next();
            }
            if (next != 2) {
                throw new XmlPullParserException("No start tag found.");
            }
            if (Build.VERSION.SDK_INT < 24) {
                String name = xml.getName();
                if (!Intrinsics.areEqual(name, "vector")) {
                    if (Intrinsics.areEqual(name, "animated-vector")) {
                        drawableOooO00o = p103o000oo00.OooOOO0.OooO00o(context, resources, xml, Xml.asAttributeSet(xml), context.getTheme());
                        Intrinsics.checkNotNullExpressionValue(drawableOooO00o, "createFromXmlInner(this,…es, parser, attrs, theme)");
                    }
                    Intrinsics.checkNotNullParameter(bitmapDrawable, "<this>");
                    if (!(bitmapDrawable instanceof p103o000oo00.OooOo) && !(bitmapDrawable instanceof VectorDrawable)) {
                        z = false;
                    }
                    if (z) {
                        Bitmap bitmapOooO00o = this.f30087OooO0O0.OooO00o(bitmapDrawable, o00oo0o2.f30376OooO0O0, size, o00oo0o2.f30378OooO0Oo, o00oo0o2.f30380OooO0o0);
                        Resources resources2 = context.getResources();
                        Intrinsics.checkNotNullExpressionValue(resources2, "context.resources");
                        bitmapDrawable = new BitmapDrawable(resources2, bitmapOooO00o);
                    }
                    return new OooO(bitmapDrawable, z, DataSource.DISK);
                }
                drawableOooO00o = p103o000oo00.OooOo.OooO00o(resources, xml, Xml.asAttributeSet(xml), context.getTheme());
                Intrinsics.checkNotNullExpressionValue(drawableOooO00o, "createFromXmlInner(resou…es, parser, attrs, theme)");
            }
            Resources.Theme theme = context.getTheme();
            Intrinsics.checkNotNullParameter(resources, "<this>");
            ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.OooO00o.f7829OooO00o;
            Drawable drawableOooO00o2 = androidx.core.content.res.OooO00o.C0045OooO00o.OooO00o(resources, iIntValue, theme);
            if (drawableOooO00o2 == null) {
                throw new IllegalStateException(Intrinsics.stringPlus("Invalid resource ID: ", Integer.valueOf(iIntValue)).toString());
            }
            bitmapDrawable = drawableOooO00o2;
            Intrinsics.checkNotNullParameter(bitmapDrawable, "<this>");
            if (!(bitmapDrawable instanceof p103o000oo00.OooOo)) {
                z = false;
            }
            if (z) {
                Bitmap bitmapOooO00o2 = this.f30087OooO0O0.OooO00o(bitmapDrawable, o00oo0o2.f30376OooO0O0, size, o00oo0o2.f30378OooO0Oo, o00oo0o2.f30380OooO0o0);
                Resources resources3 = context.getResources();
                Intrinsics.checkNotNullExpressionValue(resources3, "context.resources");
                bitmapDrawable = new BitmapDrawable(resources3, bitmapOooO00o2);
            }
            return new OooO(bitmapDrawable, z, DataSource.DISK);
        }
        drawableOooO00o = p119o00O0Oo0.o000oOoO.OooO00o(context, iIntValue);
        bitmapDrawable = drawableOooO00o;
        Intrinsics.checkNotNullParameter(bitmapDrawable, "<this>");
        if (!(bitmapDrawable instanceof p103o000oo00.OooOo)) {
            z = false;
        }
        if (z) {
            Bitmap bitmapOooO00o3 = this.f30087OooO0O0.OooO00o(bitmapDrawable, o00oo0o2.f30376OooO0O0, size, o00oo0o2.f30378OooO0Oo, o00oo0o2.f30380OooO0o0);
            Resources resources4 = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources4, "context.resources");
            bitmapDrawable = new BitmapDrawable(resources4, bitmapOooO00o3);
        }
        return new OooO(bitmapDrawable, z, DataSource.DISK);
    }
}
