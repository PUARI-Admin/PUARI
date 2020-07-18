package pinpon.common.infrastructure.datasource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Repository;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

/**
 * MongoDBを操作するリポジトリクラス。
 *
 * @author watanabe
 *
 */
@Repository
// ★application.propertiesより"database"のプレフィックスを持つプロパティを取得する設定
@ConfigurationProperties(prefix = "database")
public class MongoDBManager {

	// ★application.propertiesのdatabase.hostを格納
	private String host;
	// ★application.propertiesのdatabase.portを格納
	private String port;

	MongoClient client = null;

	/**
	 * データベースホスト名を取得する。
	 *
	 * @return データベースホスト名
	 */
	public String getHost() {
		return this.host;
	}

	/**
	 * このメソッドが自動的に呼ばれ、★application.propertiesのdatabase.hostをフィールドに設定
	 *
	 * @param host ホスト名
	 */
	public void setHost(String host) {

		this.host = host;
	}

	/**
	 * データベースポートを取得する。
	 *
	 * @return データベースポート
	 */
	public String getPort() {
		return this.port;
	}

	/**
	 * このメソッドが自動的に呼ばれ、★application.propertiesのdatabase.portをフィールドに設定
	 *
	 * @param port ホスト名
	 */
	public void setPort(String port) {
		this.port = port;
	}

	/**
	 * MongoDB接続用インスタンスを取得する。
	 *
	 *
	 * @param dbName データベース名
	 * @return MongoDB接続用インスタンス
	 */
	public MongoDatabase getDatabase(String dbName) {

		if (client == null) {

			client = new MongoClient(getHost(), Integer.parseInt(getPort()));
		}

		return client.getDatabase(dbName);
	}
}
