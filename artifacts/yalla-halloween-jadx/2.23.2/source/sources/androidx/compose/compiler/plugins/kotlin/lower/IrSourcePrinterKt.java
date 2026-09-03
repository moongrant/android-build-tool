package androidx.compose.compiler.plugins.kotlin.lower;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.ir.IrElement;
import p022Oooo00O.o00O00OO;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a`\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00060\u0003j\u0002`\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2!\u0010\u000b\u001a\u001d\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\rH\u0082\b\u001a\u0014\u0010\u000e\u001a\u00020\b*\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011¨\u0006\u0012"}, d2 = {"appendListWith", "", "T", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "list", "", "prefix", "", "postfix", "separator", "renderItem", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "dumpSrc", "Lorg/jetbrains/kotlin/ir/IrElement;", "useFir", "", "compiler-hosted"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class IrSourcePrinterKt {
    private static final <T> void appendListWith(StringBuilder sb, List<? extends T> list, String str, String str2, String str3, Function2<? super StringBuilder, ? super T, Unit> function2) {
        sb.append(str);
        boolean z = true;
        for (T t : list) {
            if (!z) {
                sb.append(str3);
            }
            function2.invoke(sb, t);
            z = false;
        }
        sb.append(str2);
    }

    @NotNull
    public static final String dumpSrc(@NotNull IrElement irElement, boolean z) {
        StringBuilder sb = new StringBuilder();
        irElement.accept(new IrSourcePrinterVisitor(sb, "%tab%", z), (Object) null);
        String string = sb.toString();
        RegexOption regexOption = RegexOption.MULTILINE;
        return new Regex("}\\n(\\s)*,", regexOption).replace(new Regex("\\n(\\s)*$", regexOption).replace(new Regex("%tab%", regexOption).replace(new Regex("\\n(%tab%)+", regexOption).replace(string, new Function1<MatchResult, CharSequence>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.IrSourcePrinterKt.dumpSrc.1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final CharSequence invoke(@NotNull MatchResult matchResult) {
                return o00O00OO.OooO00o("\n", CollectionsKt___CollectionsKt.joinToString$default(new IntRange(0, ((matchResult.getRange().getLast() - matchResult.getRange().getFirst()) - 1) / 5), "", null, null, 0, null, new Function1<Integer, CharSequence>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.IrSourcePrinterKt.dumpSrc.1.1
                    @NotNull
                    public final CharSequence invoke(int i) {
                        return "  ";
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ CharSequence invoke(Integer num) {
                        return invoke(num.intValue());
                    }
                }, 30, null));
            }
        }), ""), ""), "},");
    }

    public static /* synthetic */ String dumpSrc$default(IrElement irElement, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return dumpSrc(irElement, z);
    }
}
