package androidx.compose.ui.platform;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.Base64;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo00 implements o0000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final ClipboardManager f6302OooO00o;

    public OooOo00(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("clipboard");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ClipboardManager clipboardManager = (ClipboardManager) systemService;
        Intrinsics.checkNotNullParameter(clipboardManager, "clipboardManager");
        this.f6302OooO00o = clipboardManager;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ef  */
    @Override // androidx.compose.ui.platform.o0000O
    public final void OooO00o(@NotNull o00000O.OooO00o annotatedString) {
        CharSequence charSequence;
        byte b;
        byte b2;
        Intrinsics.checkNotNullParameter(annotatedString, "annotatedString");
        ClipboardManager clipboardManager = this.f6302OooO00o;
        Intrinsics.checkNotNullParameter(annotatedString, "<this>");
        if (annotatedString.f26757Oooo0oO.isEmpty()) {
            charSequence = annotatedString.f26756Oooo0o;
        } else {
            SpannableString spannableString = new SpannableString(annotatedString.f26756Oooo0o);
            o000O0O0 o000o0o1 = new o000O0O0();
            List<o00000O.OooO00o.OooO0O0<o00000O.o00Oo0>> list = annotatedString.f26757Oooo0oO;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                o00000O.OooO00o.OooO0O0<o00000O.o00Oo0> oooO0O0 = list.get(i);
                o00000O.o00Oo0 spanStyle = oooO0O0.f26768OooO00o;
                int i2 = oooO0O0.f26769OooO0O0;
                int i3 = oooO0O0.f26770OooO0OO;
                o000o0o1.f6438OooO00o.recycle();
                Parcel parcelObtain = Parcel.obtain();
                Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain()");
                o000o0o1.f6438OooO00o = parcelObtain;
                Intrinsics.checkNotNullParameter(spanStyle, "spanStyle");
                long jOooO0O0 = spanStyle.OooO0O0();
                o00Oo0.o00000O0.OooO00o oooO00o = p145o00Oo0.o00000O0.f32063OooO0O0;
                long j = p145o00Oo0.o00000O0.f32062OooO;
                if (!p145o00Oo0.o00000O0.OooO0Oo(jOooO0O0, j)) {
                    o000o0o1.OooO00o((byte) 1);
                    o000o0o1.OooO0Oo(spanStyle.OooO0O0());
                }
                long j2 = spanStyle.f26860OooO0O0;
                o0000O0O.o00O0O.OooO00o oooO00o2 = o0000O0O.o00O0O.f27323OooO0O0;
                long j3 = o0000O0O.o00O0O.f27325OooO0Oo;
                if (!o0000O0O.o00O0O.OooO00o(j2, j3)) {
                    o000o0o1.OooO00o((byte) 2);
                    o000o0o1.OooO0OO(spanStyle.f26860OooO0O0);
                }
                p053o00000oO.o0000O00 fontWeight = spanStyle.f26861OooO0OO;
                if (fontWeight != null) {
                    o000o0o1.OooO00o((byte) 3);
                    Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
                    o000o0o1.f6438OooO00o.writeInt(fontWeight.f27133Oooo0o);
                }
                p053o00000oO.o0000Ooo o0000ooo = spanStyle.f26862OooO0Oo;
                if (o0000ooo != null) {
                    int i4 = o0000ooo.f27135OooO00o;
                    o000o0o1.OooO00o((byte) 4);
                    if (i4 == 0) {
                        b2 = 0;
                    } else if (i4 == 1) {
                        b2 = 1;
                    } else {
                        b2 = 0;
                    }
                    o000o0o1.OooO00o(b2);
                }
                p053o00000oO.o0000 o0000Var = spanStyle.f26864OooO0o0;
                if (o0000Var != null) {
                    int i5 = o0000Var.f27110OooO00o;
                    o000o0o1.OooO00o((byte) 5);
                    if (i5 == 0) {
                        b = 0;
                    } else {
                        b = 1;
                        if (!(i5 == 1)) {
                            if (i5 == 2) {
                                b = 2;
                            } else if ((i5 != 3 ? (byte) 0 : (byte) 1) != 0) {
                                b = 3;
                            } else {
                                b = 0;
                            }
                        }
                    }
                    o000o0o1.OooO00o(b);
                }
                String string = spanStyle.f26865OooO0oO;
                if (string != null) {
                    o000o0o1.OooO00o((byte) 6);
                    Intrinsics.checkNotNullParameter(string, "string");
                    o000o0o1.f6438OooO00o.writeString(string);
                }
                if (!o0000O0O.o00O0O.OooO00o(spanStyle.f26866OooO0oo, j3)) {
                    o000o0o1.OooO00o((byte) 7);
                    o000o0o1.OooO0OO(spanStyle.f26866OooO0oo);
                }
                o0000O0.OooO00o oooO00o3 = spanStyle.f26858OooO;
                if (oooO00o3 != null) {
                    float f = oooO00o3.f27251OooO00o;
                    o000o0o1.OooO00o((byte) 8);
                    o000o0o1.OooO0O0(f);
                }
                o0000O0.OooOOO textGeometricTransform = spanStyle.f26867OooOO0;
                if (textGeometricTransform != null) {
                    o000o0o1.OooO00o((byte) 9);
                    Intrinsics.checkNotNullParameter(textGeometricTransform, "textGeometricTransform");
                    o000o0o1.OooO0O0(textGeometricTransform.f27266OooO00o);
                    o000o0o1.OooO0O0(textGeometricTransform.f27267OooO0O0);
                }
                if (!p145o00Oo0.o00000O0.OooO0Oo(spanStyle.f26869OooOO0o, j)) {
                    o000o0o1.OooO00o((byte) 10);
                    o000o0o1.OooO0Oo(spanStyle.f26869OooOO0o);
                }
                o0000O0.OooO textDecoration = spanStyle.f26871OooOOO0;
                if (textDecoration != null) {
                    o000o0o1.OooO00o((byte) 11);
                    Intrinsics.checkNotNullParameter(textDecoration, "textDecoration");
                    o000o0o1.f6438OooO00o.writeInt(textDecoration.f27249OooO00o);
                }
                p145o00Oo0.o000OO00 shadow = spanStyle.f26870OooOOO;
                if (shadow != null) {
                    o000o0o1.OooO00o((byte) 12);
                    Intrinsics.checkNotNullParameter(shadow, "shadow");
                    o000o0o1.OooO0Oo(shadow.f32107OooO00o);
                    o000o0o1.OooO0O0(o00O0O.OooO.OooO0OO(shadow.f32108OooO0O0));
                    o000o0o1.OooO0O0(o00O0O.OooO.OooO0Oo(shadow.f32108OooO0O0));
                    o000o0o1.OooO0O0(shadow.f32109OooO0OO);
                }
                String strEncodeToString = Base64.encodeToString(o000o0o1.f6438OooO00o.marshall(), 0);
                Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(bytes, Base64.DEFAULT)");
                spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", strEncodeToString), i2, i3, 33);
            }
            charSequence = spannableString;
        }
        clipboardManager.setPrimaryClip(ClipData.newPlainText("plain text", charSequence));
    }

    /* JADX WARN: Code duplicated, block: B:62:0x011d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1, types: [o00000oO.o0000Ooo] */
    /* JADX WARN: Type inference failed for: r25v10 */
    /* JADX WARN: Type inference failed for: r25v11 */
    /* JADX WARN: Type inference failed for: r25v12 */
    /* JADX WARN: Type inference failed for: r25v13 */
    /* JADX WARN: Type inference failed for: r25v14 */
    /* JADX WARN: Type inference failed for: r25v15 */
    /* JADX WARN: Type inference failed for: r25v16 */
    /* JADX WARN: Type inference failed for: r25v17 */
    /* JADX WARN: Type inference failed for: r25v18 */
    /* JADX WARN: Type inference failed for: r25v19 */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r25v20 */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r25v5 */
    /* JADX WARN: Type inference failed for: r25v6 */
    /* JADX WARN: Type inference failed for: r25v7 */
    /* JADX WARN: Type inference failed for: r25v8 */
    /* JADX WARN: Type inference failed for: r25v9 */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1, types: [o00000oO.o0000] */
    /* JADX WARN: Type inference failed for: r26v10 */
    /* JADX WARN: Type inference failed for: r26v11 */
    /* JADX WARN: Type inference failed for: r26v12 */
    /* JADX WARN: Type inference failed for: r26v13 */
    /* JADX WARN: Type inference failed for: r26v14 */
    /* JADX WARN: Type inference failed for: r26v15 */
    /* JADX WARN: Type inference failed for: r26v16 */
    /* JADX WARN: Type inference failed for: r26v17 */
    /* JADX WARN: Type inference failed for: r26v18 */
    /* JADX WARN: Type inference failed for: r26v19 */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r26v20 */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r26v4 */
    /* JADX WARN: Type inference failed for: r26v5 */
    /* JADX WARN: Type inference failed for: r26v6 */
    /* JADX WARN: Type inference failed for: r26v7 */
    /* JADX WARN: Type inference failed for: r26v8 */
    /* JADX WARN: Type inference failed for: r26v9 */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r28v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r28v10 */
    /* JADX WARN: Type inference failed for: r28v11 */
    /* JADX WARN: Type inference failed for: r28v12 */
    /* JADX WARN: Type inference failed for: r28v13 */
    /* JADX WARN: Type inference failed for: r28v14 */
    /* JADX WARN: Type inference failed for: r28v15 */
    /* JADX WARN: Type inference failed for: r28v16 */
    /* JADX WARN: Type inference failed for: r28v17 */
    /* JADX WARN: Type inference failed for: r28v18 */
    /* JADX WARN: Type inference failed for: r28v19 */
    /* JADX WARN: Type inference failed for: r28v2 */
    /* JADX WARN: Type inference failed for: r28v20 */
    /* JADX WARN: Type inference failed for: r28v21 */
    /* JADX WARN: Type inference failed for: r28v4 */
    /* JADX WARN: Type inference failed for: r28v5 */
    /* JADX WARN: Type inference failed for: r28v6 */
    /* JADX WARN: Type inference failed for: r28v7 */
    /* JADX WARN: Type inference failed for: r28v8 */
    /* JADX WARN: Type inference failed for: r28v9 */
    /* JADX WARN: Type inference failed for: r31v0 */
    /* JADX WARN: Type inference failed for: r31v1, types: [o0000O0.OooO00o] */
    /* JADX WARN: Type inference failed for: r31v10 */
    /* JADX WARN: Type inference failed for: r31v11 */
    /* JADX WARN: Type inference failed for: r31v12 */
    /* JADX WARN: Type inference failed for: r31v13 */
    /* JADX WARN: Type inference failed for: r31v14 */
    /* JADX WARN: Type inference failed for: r31v15 */
    /* JADX WARN: Type inference failed for: r31v16 */
    /* JADX WARN: Type inference failed for: r31v17 */
    /* JADX WARN: Type inference failed for: r31v18 */
    /* JADX WARN: Type inference failed for: r31v19 */
    /* JADX WARN: Type inference failed for: r31v2 */
    /* JADX WARN: Type inference failed for: r31v20 */
    /* JADX WARN: Type inference failed for: r31v3 */
    /* JADX WARN: Type inference failed for: r31v4 */
    /* JADX WARN: Type inference failed for: r31v5 */
    /* JADX WARN: Type inference failed for: r31v6 */
    /* JADX WARN: Type inference failed for: r31v7 */
    /* JADX WARN: Type inference failed for: r31v8 */
    /* JADX WARN: Type inference failed for: r31v9 */
    /* JADX WARN: Type inference failed for: r32v0 */
    /* JADX WARN: Type inference failed for: r32v1, types: [o0000O0.OooOOO] */
    /* JADX WARN: Type inference failed for: r32v10 */
    /* JADX WARN: Type inference failed for: r32v11 */
    /* JADX WARN: Type inference failed for: r32v12 */
    /* JADX WARN: Type inference failed for: r32v13 */
    /* JADX WARN: Type inference failed for: r32v14 */
    /* JADX WARN: Type inference failed for: r32v15 */
    /* JADX WARN: Type inference failed for: r32v16 */
    /* JADX WARN: Type inference failed for: r32v17 */
    /* JADX WARN: Type inference failed for: r32v18 */
    /* JADX WARN: Type inference failed for: r32v19 */
    /* JADX WARN: Type inference failed for: r32v2 */
    /* JADX WARN: Type inference failed for: r32v20 */
    /* JADX WARN: Type inference failed for: r32v3 */
    /* JADX WARN: Type inference failed for: r32v4 */
    /* JADX WARN: Type inference failed for: r32v5 */
    /* JADX WARN: Type inference failed for: r32v6 */
    /* JADX WARN: Type inference failed for: r32v7 */
    /* JADX WARN: Type inference failed for: r32v8 */
    /* JADX WARN: Type inference failed for: r32v9 */
    /* JADX WARN: Type inference failed for: r36v0 */
    /* JADX WARN: Type inference failed for: r36v1, types: [o0000O0.OooO] */
    /* JADX WARN: Type inference failed for: r36v10 */
    /* JADX WARN: Type inference failed for: r36v11 */
    /* JADX WARN: Type inference failed for: r36v12 */
    /* JADX WARN: Type inference failed for: r36v2 */
    /* JADX WARN: Type inference failed for: r36v5 */
    /* JADX WARN: Type inference failed for: r36v6 */
    /* JADX WARN: Type inference failed for: r36v7 */
    /* JADX WARN: Type inference failed for: r36v8 */
    /* JADX WARN: Type inference failed for: r36v9 */
    /* JADX WARN: Type inference failed for: r37v0 */
    /* JADX WARN: Type inference failed for: r37v1, types: [o00Oo0.o000OO00] */
    /* JADX WARN: Type inference failed for: r37v10 */
    /* JADX WARN: Type inference failed for: r37v11 */
    /* JADX WARN: Type inference failed for: r37v2 */
    /* JADX WARN: Type inference failed for: r37v4 */
    /* JADX WARN: Type inference failed for: r37v5 */
    /* JADX WARN: Type inference failed for: r37v6 */
    /* JADX WARN: Type inference failed for: r37v7 */
    /* JADX WARN: Type inference failed for: r37v8 */
    /* JADX WARN: Type inference failed for: r37v9 */
    @Override // androidx.compose.ui.platform.o0000O
    @Nullable
    public final o00000O.OooO00o getText() {
        ?? oooOOO;
        ?? oooO00o;
        ?? o0000Var;
        ?? o0000ooo;
        ?? string;
        ClipData primaryClip = this.f6302OooO00o.getPrimaryClip();
        p053o00000oO.o0000O00 o0000o00 = null;
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            ClipData.Item itemAt = primaryClip.getItemAt(0);
            CharSequence text = itemAt != null ? itemAt.getText() : null;
            if (text != null) {
                if (!(text instanceof Spanned)) {
                    return new o00000O.OooO00o(text.toString(), null, 6);
                }
                Spanned spanned = (Spanned) text;
                Annotation[] annotations = (Annotation[]) spanned.getSpans(0, text.length(), Annotation.class);
                ArrayList arrayList = new ArrayList();
                Intrinsics.checkNotNullExpressionValue(annotations, "annotations");
                int lastIndex = ArraysKt.getLastIndex(annotations);
                if (lastIndex >= 0) {
                    int i = 0;
                    while (true) {
                        Annotation annotation = annotations[i];
                        if (Intrinsics.areEqual(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                            int spanStart = spanned.getSpanStart(annotation);
                            int spanEnd = spanned.getSpanEnd(annotation);
                            String value = annotation.getValue();
                            Intrinsics.checkNotNullExpressionValue(value, "span.value");
                            o000O000 o000o001 = new o000O000(value);
                            o00Oo0.o00000O0.OooO00o oooO00o2 = p145o00Oo0.o00000O0.f32063OooO0O0;
                            long j = p145o00Oo0.o00000O0.f32062OooO;
                            o0000O0O.o00O0O.OooO00o oooO00o3 = o0000O0O.o00O0O.f27323OooO0O0;
                            p053o00000oO.o0000O00 o0000o01 = o0000o00;
                            ?? r25 = o0000o01;
                            ?? r26 = r25;
                            ?? r28 = r26;
                            ?? r31 = r28;
                            ?? r32 = r31;
                            ?? oooO = r32;
                            ?? o000oo01 = oooO;
                            long jOooO0OO = j;
                            long jOooO0OO2 = jOooO0OO;
                            long jOooO0o0 = o0000O0O.o00O0O.f27325OooO0Oo;
                            long jOooO0o1 = jOooO0o0;
                            while (true) {
                                int i2 = 1;
                                if (o000o001.f6434OooO00o.dataAvail() > 1) {
                                    byte bOooO0O0 = o000o001.OooO0O0();
                                    if (bOooO0O0 == 1) {
                                        if (o000o001.OooO00o() >= 8) {
                                            jOooO0OO = o000o001.OooO0OO();
                                        }
                                    } else if (bOooO0O0 == 2) {
                                        if (o000o001.OooO00o() >= 5) {
                                            jOooO0o0 = o000o001.OooO0o0();
                                            o0000ooo = r25;
                                            o0000Var = r26;
                                            string = r28;
                                            oooO00o = r31;
                                            oooOOO = r32;
                                            r25 = o0000ooo;
                                            r26 = o0000Var;
                                            r28 = string;
                                            r31 = oooO00o;
                                            r32 = oooOOO;
                                            oooO = oooO;
                                            o000oo01 = o000oo01;
                                            r25 = r25;
                                            r26 = r26;
                                            r28 = r28;
                                            r31 = r31;
                                            r32 = r32;
                                            oooO = oooO;
                                            o000oo01 = o000oo01;
                                        }
                                    } else if (bOooO0O0 == 3) {
                                        if (o000o001.OooO00o() >= 4) {
                                            o0000o01 = new p053o00000oO.o0000O00(o000o001.f6434OooO00o.readInt());
                                            o0000ooo = r25;
                                            o0000Var = r26;
                                            string = r28;
                                            oooO00o = r31;
                                            oooOOO = r32;
                                            r25 = o0000ooo;
                                            r26 = o0000Var;
                                            r28 = string;
                                            r31 = oooO00o;
                                            r32 = oooOOO;
                                            oooO = oooO;
                                            o000oo01 = o000oo01;
                                            r25 = r25;
                                            r26 = r26;
                                            r28 = r28;
                                            r31 = r31;
                                            r32 = r32;
                                            oooO = oooO;
                                            o000oo01 = o000oo01;
                                        }
                                    } else if (bOooO0O0 == 4) {
                                        if (o000o001.OooO00o() >= 1) {
                                            byte bOooO0O1 = o000o001.OooO0O0();
                                            o0000ooo = new p053o00000oO.o0000Ooo((bOooO0O1 == 0 || bOooO0O1 != 1) ? 0 : 1);
                                            o0000Var = r26;
                                            string = r28;
                                            oooO00o = r31;
                                            oooOOO = r32;
                                            r25 = o0000ooo;
                                            r26 = o0000Var;
                                            r28 = string;
                                            r31 = oooO00o;
                                            r32 = oooOOO;
                                            oooO = oooO;
                                            o000oo01 = o000oo01;
                                            r25 = r25;
                                            r26 = r26;
                                            r28 = r28;
                                            r31 = r31;
                                            r32 = r32;
                                            oooO = oooO;
                                            o000oo01 = o000oo01;
                                        }
                                    } else if (bOooO0O0 != 5) {
                                        if (bOooO0O0 == 6) {
                                            o0000ooo = r25;
                                            o0000Var = r26;
                                            string = o000o001.f6434OooO00o.readString();
                                            oooO00o = r31;
                                            oooOOO = r32;
                                        } else if (bOooO0O0 == 7) {
                                            if (o000o001.OooO00o() >= 5) {
                                                jOooO0o1 = o000o001.OooO0o0();
                                                o0000ooo = r25;
                                                o0000Var = r26;
                                                string = r28;
                                                oooO00o = r31;
                                                oooOOO = r32;
                                            }
                                        } else if (bOooO0O0 == 8) {
                                            if (o000o001.OooO00o() >= 4) {
                                                oooO00o = new o0000O0.OooO00o(o000o001.OooO0Oo());
                                                o0000ooo = r25;
                                                o0000Var = r26;
                                                string = r28;
                                                oooOOO = r32;
                                            }
                                        } else if (bOooO0O0 == 9) {
                                            if (o000o001.OooO00o() >= 8) {
                                                oooOOO = new o0000O0.OooOOO(o000o001.OooO0Oo(), o000o001.OooO0Oo());
                                                o0000ooo = r25;
                                                o0000Var = r26;
                                                string = r28;
                                                oooO00o = r31;
                                            }
                                        } else if (bOooO0O0 != 10) {
                                            if (bOooO0O0 != 11) {
                                                if (bOooO0O0 == 12) {
                                                    if (o000o001.OooO00o() < 20) {
                                                        r25 = r25;
                                                        r26 = r26;
                                                        r28 = r28;
                                                        r31 = r31;
                                                        r32 = r32;
                                                        oooO = oooO;
                                                        o000oo01 = o000oo01;
                                                        break;
                                                    }
                                                    r25 = r25;
                                                    r26 = r26;
                                                    r28 = r28;
                                                    r31 = r31;
                                                    r32 = r32;
                                                    oooO = oooO;
                                                    o000oo01 = o000oo01;
                                                    r25 = r25;
                                                    r26 = r26;
                                                    r28 = r28;
                                                    r31 = r31;
                                                    r32 = r32;
                                                    oooO = oooO;
                                                    o000oo01 = new p145o00Oo0.o000OO00(o000o001.OooO0OO(), o00O0O.OooOO0.OooO00o(o000o001.OooO0Oo(), o000o001.OooO0Oo()), o000o001.OooO0Oo());
                                                }
                                            } else if (o000o001.OooO00o() >= 4) {
                                                int i3 = o000o001.f6434OooO00o.readInt();
                                                o0000O0.OooO oooO2 = o0000O0.OooO.f27248OooO0o0;
                                                boolean z = (i3 & 2) != 0;
                                                o0000O0.OooO oooO3 = o0000O0.OooO.f27247OooO0Oo;
                                                boolean z2 = (i3 & 1) != 0;
                                                if (z && z2) {
                                                    List decorations = CollectionsKt.listOf((Object[]) new o0000O0.OooO[]{oooO2, oooO3});
                                                    Intrinsics.checkNotNullParameter(decorations, "decorations");
                                                    Integer numValueOf = 0;
                                                    int size = decorations.size();
                                                    for (int i4 = 0; i4 < size; i4++) {
                                                        numValueOf = Integer.valueOf(numValueOf.intValue() | ((o0000O0.OooO) decorations.get(i4)).f27249OooO00o);
                                                    }
                                                    oooO = new o0000O0.OooO(numValueOf.intValue());
                                                    r25 = r25;
                                                    r26 = r26;
                                                    r28 = r28;
                                                    r31 = r31;
                                                    r32 = r32;
                                                    o000oo01 = o000oo01;
                                                } else {
                                                    r25 = r25;
                                                    r26 = r26;
                                                    r28 = r28;
                                                    r31 = r31;
                                                    r32 = r32;
                                                    oooO = oooO2;
                                                    o000oo01 = o000oo01;
                                                    if (!z) {
                                                        if (z2) {
                                                            oooO = oooO3;
                                                            r25 = r25;
                                                            r26 = r26;
                                                            r28 = r28;
                                                            r31 = r31;
                                                            r32 = r32;
                                                            o000oo01 = o000oo01;
                                                        } else {
                                                            r25 = r25;
                                                            r26 = r26;
                                                            r28 = r28;
                                                            r31 = r31;
                                                            r32 = r32;
                                                            oooO = o0000O0.OooO.f27246OooO0OO;
                                                            o000oo01 = o000oo01;
                                                        }
                                                    }
                                                }
                                            }
                                            r25 = r25;
                                            r26 = r26;
                                            r28 = r28;
                                            r31 = r31;
                                            r32 = r32;
                                            oooO = oooO;
                                            o000oo01 = o000oo01;
                                        } else if (o000o001.OooO00o() >= 8) {
                                            jOooO0OO2 = o000o001.OooO0OO();
                                            o0000ooo = r25;
                                            o0000Var = r26;
                                            string = r28;
                                            oooO00o = r31;
                                            oooOOO = r32;
                                        }
                                        r25 = o0000ooo;
                                        r26 = o0000Var;
                                        r28 = string;
                                        r31 = oooO00o;
                                        r32 = oooOOO;
                                        oooO = oooO;
                                        o000oo01 = o000oo01;
                                        r25 = r25;
                                        r26 = r26;
                                        r28 = r28;
                                        r31 = r31;
                                        r32 = r32;
                                        oooO = oooO;
                                        o000oo01 = o000oo01;
                                    } else if (o000o001.OooO00o() >= 1) {
                                        byte bOooO0O2 = o000o001.OooO0O0();
                                        if (bOooO0O2 == 0) {
                                            i2 = 0;
                                        } else if (bOooO0O2 != 1) {
                                            if (bOooO0O2 == 3) {
                                                i2 = 3;
                                            } else if (bOooO0O2 == 2) {
                                                i2 = 2;
                                            } else {
                                                i2 = 0;
                                            }
                                        }
                                        o0000Var = new p053o00000oO.o0000(i2);
                                        o0000ooo = r25;
                                        string = r28;
                                        oooO00o = r31;
                                        oooOOO = r32;
                                        r25 = o0000ooo;
                                        r26 = o0000Var;
                                        r28 = string;
                                        r31 = oooO00o;
                                        r32 = oooOOO;
                                        oooO = oooO;
                                        o000oo01 = o000oo01;
                                        r25 = r25;
                                        r26 = r26;
                                        r28 = r28;
                                        r31 = r31;
                                        r32 = r32;
                                        oooO = oooO;
                                        o000oo01 = o000oo01;
                                    }
                                }
                                break;
                            }
                            arrayList.add(new o00000O.OooO00o.OooO0O0(new o00000O.o00Oo0(jOooO0OO, jOooO0o0, o0000o01, (p053o00000oO.o0000Ooo) r25, (p053o00000oO.o0000) r26, (p053o00000oO.o000OOo) null, (String) r28, jOooO0o1, (o0000O0.OooO00o) r31, (o0000O0.OooOOO) r32, (o0000.OooO) null, jOooO0OO2, (o0000O0.OooO) oooO, (p145o00Oo0.o000OO00) o000oo01), spanStart, spanEnd));
                        }
                        if (i == lastIndex) {
                            break;
                        }
                        i++;
                        o0000o00 = null;
                    }
                }
                return new o00000O.OooO00o(text.toString(), arrayList, 4);
            }
        }
        return null;
    }
}
