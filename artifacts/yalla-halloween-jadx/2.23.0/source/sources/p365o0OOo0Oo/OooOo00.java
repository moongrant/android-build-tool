package p365o0OOo0Oo;

import androidx.lifecycle.MutableLiveData;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nEmojiEditText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmojiEditText.kt\ncom/yalla/support/emojifaceutil/EmojiEditTextHelper\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,293:1\n13644#2,3:294\n*S KotlinDebug\n*F\n+ 1 EmojiEditText.kt\ncom/yalla/support/emojifaceutil/EmojiEditTextHelper\n*L\n260#1:294,3\n*E\n"})
public final class OooOo00 {
    @NotNull
    public static ArrayList OooO00o(@NotNull CharSequence text) {
        Intrinsics.checkNotNullParameter(text, "text");
        Matcher matcher = Oooo000.f43957OooO0Oo.matcher(text);
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            String group = matcher.group();
            Intrinsics.checkNotNullExpressionValue(group, "group");
            MutableLiveData<List<OooOo>> mutableLiveData = Oooo000.f43954OooO00o;
            if (Oooo000.OooO0O0(StringsKt__StringsKt.removeSuffix(group, (CharSequence) "_")) != null) {
                arrayList.add(new Pair(Integer.valueOf(matcher.start()), Integer.valueOf(matcher.end())));
            }
        }
        return arrayList;
    }
}
