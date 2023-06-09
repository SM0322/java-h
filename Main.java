git ignoreファイルを作り設定することで、クラスファイルをcommitすることを防ぐことができる

branch　基本はmainブランチで開発を進めるがgit checkout -b でブランチを切って別の軸で開発をすることができる

インターネット上のリモートリポジトリでマージに対してのプルリクエストを行うことで別れていたブランチを結合（merge)することができる

設計図の書き方のルール: モデリング言語(ER図やフローチャートなど)

クラス図: 蔵アス名にフィールドやメソッドを書く(ER図みたいな感じ)

シーケンス図: 実際のプログラムの動きになるように上から下に流れていく設計図

開発の種類; ウォーターフォール型、要件定義、設計、開発、テストの一連の流れで開発する
　　　　　　この方法は前工程で誤りがあると手戻りが発生し修正が大変
　　　　　　スパイラル型: をーたフォール型を少しずつ何度も繰り返して開発する
　　　　　　近年はこちらの開発形態に移行している、顧客からのフィードバックをもらい
　　　　　　完成形を目指していく しかしこちらにも長期的な計画を立てづらい、要求が過度に大きくなってしまうなどの弱点がある
　　　　　　
　　　　　　アジャイルソフトウェア開発宣言
　　　　　　顧客満足度を優先し価値あるソフトウェアを早く継続的に提供するという考え
　　　　　　この宣言がされた後変化への対応に優れたXPやスクラムといった開発手法が提唱された
　　　　　　
　　　　　　基本的には2~4週間の短期間で工程を反復するスパイラル型開発
　　　　　　
　　　　　　xp
　　　　　　シンプルさ、コミュニケーション、フィードバック、相互尊重、勇気
　　　　　　5つの価値観に基づいた開発手法
　　　　　　
　　　　　　テスト駆動開発
　　　　　　テストケースを記述し、それを実行して失敗することを確認する
　　　　　　最小限の労力で修正
　　　　　　テストが通ることを維持しつつリファクタリング
　　　　　　この時テストをたくさん用意するのでなく１つずつ素早く繰り返すことが重要
　　　　　　統合テストもそうだが、細かく回数をこなすことの方がテストは効果がある
　　　　　　
　　　　　　スクラム
　　　　　　開発チームの各メンバーの役割や連携に関するアジャイル開発方法論のこと
　　　　　　スクラムマスターと呼ばれるメンバーがスクラムを正しく実践できているかをの指導を行ったりする
　　　　　　
　　　　　　ビルドエージェント
　　　　　　リポジトリを監視するシステムで
　　　　　　
　　　　　　コード記述に関する原則
　　　　　　DRY(Don't repeat yourself): 同じことを何度もやらない
　　　　　　重複するような記述はメソッドにまとめてリファクタリングする
　　　　　　
　　　　　　PIE(Program Intently and Expressively): 意味や意図を明確に記述
　　　　　　そのメソッド名や内容を見てすぐにどういったことをしているのかわかりやすいコードを記述する
　　　　　　適切な名前を選択することが大事
　　　　　　
　　　　　　SRP(Single Responsibility Principle): クラスに与える責務は１つだけ
　　　　　　多くの機能を１つのクラスに組み込むことは可能だが、修正やテストの負担が重くなる
　　　　　　なので、択ラスト間れ性が低く複数の役割を持つクラスは複数のクラスに分割するとよい
　　　　　　
　　　　　　OCP(Open-Closed Principle): 既存部分の修正なしで拡張可能に
　　　　　　将来的な機能追加に備え、既存部分を修正することないような記述をすること
　　　　　　理由のないfinal宣言やオーバーライド禁止はやめておく
　　　　　　
　　　　　　SDP(Stable Dependencies Principle): 安定したものに依存する
　　　　　　多数のプログラムで構成されるので更新頻度の低いものと高いものがある。
　　　　　　その中で更新頻度の少ないクラスに依存したプログラムを作ることを意識する
　　　　　　
　　　　　　
　　　　　　ADP(Acyclic Dependencies Principle): 非循環依存の原則
　　　　　　クラス同士、または複数のクラス間で相互依存または循環依存するような作りをやめる
　　　　　　
　　　　　　デザインパターン: プログラムに利用する設計の城跡やお手本のことを言う
　　　　　　java.util.Iterator: 1つずつ順に処理していくには→役のクラスを作り、そのインスタンスを用いるという考え方
　　　　　　パターンを覚えることのメリット
　　　　　　設計についてお議論をしやすくなる、意思疎通が図りやすくなる
　　　　　　
　　　　　　Facade: 窓口という意味でプログラムを作る際の最初の窓口を作るやり方をFacadeパターンという
　　　　　　最初の呼び出しさえすれば後はプログラムがやってくれるのでユーザーにやさしい
　　　　　　
　　　　　　今までの知識だとjavaではnewするだけでインスタンスが作れてしまうので唯一性というものがないと言える。
　　　　　　
　　　　　public final class SingleLetonFlower{
　　　　　    private static SingleletonFlower theInstance;
　　　　　   // 唯一のインスタンス保存用
　　　　　   private SingleletonFlower() {}
　　　　　   public static SingletonFlower getInstance {
　　　　　       if (theInstance == null) {
　　　　　           theInstance = new SingleletonFlower();
　　　　　       }
　　　　　       return theInstance;
　　　　　   }
　　　　　}
　　　　　
　　　　　privateコンストラクタ: privateにすることでコンストラクタは他から呼び出されることはない
　　　　　そしてgetメソッドの１回目のみでインスタンスは生成されるので唯一のインスタンスとなる
　　　　　
　　　　　strategyパターン: ゲームでcpuの強さを任意で選べるとき、プログラム側では受け取った引数からnewされるinstanceが決まっている構造のことを言
　　　　　
　　　　　TempleteMethodパターン: 処理の大まかな流れを決めるfinalメソッドと処理の詳細を記述したprotected abstractメソッドを用意し、
　　　　　大まかな動きはコチラで設定し、詳細部分はサブクラスを開発する人にゆだねる形の構造
　　　　　
　　　　　JARマニフェスト: META-INFO/MANIFIEST.MFを用意し、各情報の宣言を行う