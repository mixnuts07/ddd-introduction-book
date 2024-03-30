#### DDDはドメインの知識に焦点を当てた設計手法

##### DDDの用語は大別すると２種類
- モデリング
  - ソフトウェアにとって重要な概念を抽出。事象・概念を抽象化する作業。
- パターン
  - 概念を実装に落とし込む

##### 用語
- モデル
  - 現実の事象あるいは概念を抽象化した概念
- ドメインモデル
  - ドメインの概念をモデリングして得られたモデル
- ドメインオブジェクト
  - ドメインモデルをソフトウェアで動作するモジュールとして表現したもの

##### パターン

アプリケーションを表現するパターンのものが知識を表現するパターンのものを利用する関係性がある。

- 知識を表現（ドメインオブジェクト）
  - 値オブジェクト
    - ドメイン・システム固有の概念を値として表現
    - 特徴
      - 不変である
      - 交換が可能
      - 等価性によって比較される
  - エンティティ
  - ドメインサービス
    - 値オブジェクト・エンティティでうまく表現できない知識を取り扱う
- アプリケーションを実現
  - リポジトリ
    - データの保存や復元といった永続化や再構築を担当。
  - アプリケーションサービス
  - ファクトリ
    - オブジェクトを作る知識に特化したオブジェクト。生成に関する知識を一箇所にまとめる。
- 知識を表現、より発展的
  - 集約
    - 整合性を保つ境界。値オブジェクトやエンティティを束ねて複雑なドメインの概念を表現。
  - 仕様
    - オブジェクトの評価を行う。ある特定の条件下にあるかを判定する評価の振る舞いをモジュールとしてうまく表現する。

